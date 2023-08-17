package net.qzimyion.cellulose.screen.sawmill;

import com.google.common.collect.Lists;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.*;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.qzimyion.cellulose.recipe.SawmillingRecipe;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import net.qzimyion.cellulose.registry.CelluloseSounds;
import net.qzimyion.cellulose.screen.CelluloseScreens;

import java.util.List;
import java.util.Optional;

public class SawmillScreenHandler extends ScreenHandler {
    private final ScreenHandlerContext context;
    private final Property selectedRecipe = Property.create();
    private final World world;
    private final List<SawmillingRecipe> availableRecipes = Lists.newArrayList();
    private ItemStack inputStack = ItemStack.EMPTY;
    private final ItemStack inputStack1 = ItemStack.EMPTY;
    long lastTakeTime;
    final Slot inputSlot;
    final Slot inputSlot1;
    final Slot outputSlot;
    public  List<ItemStack> ingredients;
    Runnable contentsChangedListener = () -> {};
    public final Inventory input = new SimpleInventory(2){

        @Override
        public void markDirty() {
            super.markDirty();
            SawmillScreenHandler.this.onContentChanged(this);
            SawmillScreenHandler.this.contentsChangedListener.run();
        }
    };
    final CraftingResultInventory output = new CraftingResultInventory();

    public SawmillScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public SawmillScreenHandler(int syncId, PlayerInventory playerInventory, final ScreenHandlerContext context) {
        super(CelluloseScreens.SAWMILL_SCREEN_HANDLER, syncId);
        int i;
        this.context = context;
        this.world = playerInventory.player.getWorld();
        this.inputSlot = this.addSlot(new Slot(this.input, 0, 25, 21));
        this.inputSlot1 = this.addSlot(new Slot(this.input, 1, 25, 41));
        this.outputSlot = this.addSlot(new Slot(this.output, 2, 143, 33){

            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                stack.onCraft(player.getWorld(), player, stack.getCount());
                SawmillScreenHandler.this.output.unlockLastRecipe(player, ingredients);
                ItemStack itemStack = SawmillScreenHandler.this.inputSlot.takeStack(1);
                ItemStack itemStack1 = SawmillScreenHandler.this.inputSlot1.takeStack(1);

                if (!itemStack.isEmpty()) {
                    SawmillScreenHandler.this.populateResult();
                }
                if (!itemStack1.isEmpty()) {
                    SawmillScreenHandler.this.populateResult();
                }
                context.run((world, pos) -> {
                    long l = world.getTime();
                    if (SawmillScreenHandler.this.lastTakeTime != l) {
                        world.playSound(null, pos, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                        SawmillScreenHandler.this.lastTakeTime = l;
                    }
                });
                super.onTakeItem(player, stack);
            }
        });
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
        this.addProperty(this.selectedRecipe);
    }

    public int getSelectedRecipe() {
        return this.selectedRecipe.get();
    }

    public List<SawmillingRecipe> getAvailableRecipes() {
        return this.availableRecipes;
    }

    public int getAvailableRecipeCount() {
        return this.availableRecipes.size();
    }

    public boolean canCraft() {
        return this.inputSlot.hasStack() && this.inputSlot1.hasStack() && !this.availableRecipes.isEmpty();
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return SawmillScreenHandler.canUse(this.context, player, CelluloseBlocks.SAWMILL);
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        if (this.isInBounds(id)) {
            this.selectedRecipe.set(id);
            this.populateResult();
        }
        return true;
    }

    private boolean isInBounds(int id) {
        return id >= 0 && id < this.availableRecipes.size();
    }

    @Override
    public void onContentChanged(Inventory inventory) {
        ItemStack itemStack = this.inputSlot.getStack();
        if (!itemStack.isOf(this.inputStack.getItem())) {
            this.inputStack = itemStack.copy();
            this.updateInput(itemStack);
        }

    }

    private void updateInput(ItemStack itemStack) {
        this.availableRecipes.clear();
        this.selectedRecipe.set(-1);
        this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
        if (!itemStack.isEmpty()) {
            SimpleInventory inventory = new SimpleInventory(inputStack, inputStack1);
            Optional<SawmillingRecipe> match = world.getRecipeManager().getFirstMatch(SawmillingRecipe.Type.INSTANCE, inventory, world);

        }
    }


    private boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output)
    {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private Object canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }

    void populateResult() {
        if (!this.availableRecipes.isEmpty() && this.isInBounds(this.selectedRecipe.get())) {
            SawmillingRecipe sawmillingRecipe = this.availableRecipes.get(this.selectedRecipe.get());
            ItemStack itemStack = sawmillingRecipe.craft((SimpleInventory) this.input, this.world.getRegistryManager());
            if (itemStack.isItemEnabled(this.world.getEnabledFeatures())) {
                this.output.setLastRecipe(sawmillingRecipe);
                this.outputSlot.setStackNoCallbacks(itemStack);
            } else {
                this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
            }

            ItemStack itemStack1 = sawmillingRecipe.craft((SimpleInventory) this.input, this.world.getRegistryManager());
            if (itemStack1.isItemEnabled(this.world.getEnabledFeatures())) {
                this.output.setLastRecipe(sawmillingRecipe);
                this.outputSlot.setStackNoCallbacks(itemStack1);
            } else {
                this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
            }
        } else {
            this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
        }
        this.sendContentUpdates();
    }

    @Override
    public ScreenHandlerType<?> getType() {
        return CelluloseScreens.SAWMILL_SCREEN_HANDLER;
    }

    public void setContentsChangedListener(Runnable contentsChangedListener) {
        this.contentsChangedListener = contentsChangedListener;
    }

    @Override
    public boolean canInsertIntoSlot(ItemStack stack, Slot slot) {
        return slot.inventory != this.output && super.canInsertIntoSlot(stack, slot);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot2 = this.slots.get(slot);
        if (slot2 != null && slot2.hasStack()) {
            ItemStack itemStack2 = slot2.getStack();
            Item item = itemStack2.getItem();
            itemStack = itemStack2.copy();
            ItemStack itemStack1 = this.input.getStack(1);
            if (slot == 1) {
                item.onCraft(itemStack2, player.getWorld(), player);
                if (!this.insertItem(itemStack2, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }
                slot2.onQuickTransfer(itemStack2, itemStack);
            } else if (slot == 0 ? !this.insertItem(itemStack2, 3, 39, false) : (this.world.getRecipeManager().getFirstMatch(SawmillingRecipe.Type.INSTANCE, new SimpleInventory(itemStack2), this.world).isPresent() ? !this.insertItem(itemStack1, 0, 2, false) : (slot >= 3 && slot < 30 ? !this.insertItem(itemStack2, 30, 39, false) : slot >= 30 && slot < 39 && !this.insertItem(itemStack2, 3, 30, false)))) {
                return ItemStack.EMPTY;
            }
            if (itemStack2.isEmpty()) {
                slot2.setStack(ItemStack.EMPTY);
            } else {
                slot2.markDirty();
            }
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot2.onTakeItem(player, itemStack2);
        }
        return itemStack;
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        this.output.removeStack(1);
        this.context.run((world, pos) -> this.dropInventory(player, this.input));
    }
}