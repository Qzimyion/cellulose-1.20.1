package net.qzimyion.cellulose.blocks;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

import java.util.Map;

public class ModBlockProperties {

    public static final IntProperty FRUIT_AMOUNT = IntProperty.of("fruit_amount", 1, 4);
    public static final IntProperty SAWDUST_LAYERS = IntProperty.of("sawdust_layers", 1, 16);
    public static final BooleanProperty TOP = BooleanProperty.of("top");
    public static final BooleanProperty SPIKE_ACTIVE = BooleanProperty.of("spike_active");

    //Armour properties
    public static boolean hasThorns(LivingEntity entity) {
        return EnchantmentHelper.getEquipmentLevel(Enchantments.THORNS, entity) > 0;
    }

    public static boolean ImmuneToSpikyStuff (LivingEntity entity){
        return entity.getEquippedStack(EquipmentSlot.FEET).isOf(Items.CHAINMAIL_BOOTS);
    }

    ///Shape properties
    //Shoji Blocks


    //Cauldron behaviors
    public static final Map<Item, CauldronBehavior> BAMBOO_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final CauldronBehavior FILL_WITH_BAMBOO_SHELLS = (state, world, pos, player, hand, stack) -> CauldronBehavior.fillCauldron(world, pos, player, hand, stack, CelluloseBlocks.DISSOLVED_BAMBOO_CAULDRON_BLOCK.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY);

    //Extra slots properties
    public static final BooleanProperty SLOT_6_OCCUPIED = BooleanProperty.of("slot_6_occupied");
    public static final BooleanProperty SLOT_7_OCCUPIED = BooleanProperty.of("slot_7_occupied");
    public static final BooleanProperty SLOT_8_OCCUPIED = BooleanProperty.of("slot_8_occupied");

    //Bamboo Chiseled bookshelf properties
    public static final IntProperty BOOKS_STORED = IntProperty.of("books_stored", 0, 7);
    public static final IntProperty LAST_INTERACTION_BOOK_SLOT = IntProperty.of("last_interaction_book_slot", 0, 7);
}
