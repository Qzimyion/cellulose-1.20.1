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


    //Triple door Properties


    //Cauldron behaviors
    public static final Map<Item, CauldronBehavior> BAMBOO_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> DISSOVLED_BAMBOO_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> PAPER_MESH_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final CauldronBehavior FILL_WITH_BAMBOO_SHELLS = (state, world, pos, player, hand, stack) -> CauldronBehavior.fillCauldron(world, pos, player, hand, stack, CelluloseBlocks.DISSOLVED_BAMBOO_CAULDRON_BLOCK.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY);
}
