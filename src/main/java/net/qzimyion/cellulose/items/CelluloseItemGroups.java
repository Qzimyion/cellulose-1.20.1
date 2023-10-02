package net.qzimyion.cellulose.items;

import net.minecraft.item.ItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import static net.minecraft.item.Items.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.BLOOMING_AZALEA_STAIRS;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

@SuppressWarnings("UnstableApiUsage")
public class CelluloseItemGroups
{
    public static void registerItemGroups()
    {
        //This section adds items to ingredients group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(EGG, PIPIS);
            content.add(ACORN);
            content.add(AZALEA_FLOWERS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(DRIED_KELP, POPPED_ACORN);
            content.addAfter(SUSPICIOUS_STEW, POPACORN_BOWL);
        });

        /* This section adds items to building blocks group */

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            /* Section 1: Vertical Planks */
            content.addAfter(OAK_SLAB, VERTICAL_OAK_PLANKS, VERTICAL_OAK_STAIR, VERTICAL_OAK_SLAB);
            content.addAfter(BIRCH_SLAB, VERTICAL_BIRCH_PLANKS, VERTICAL_BIRCH_STAIR, VERTICAL_BIRCH_SLAB);
            content.addAfter(SPRUCE_SLAB, VERTICAL_SPRUCE_PLANKS, VERTICAL_SPRUCE_STAIR, VERTICAL_SPRUCE_SLAB);
            content.addAfter(DARK_OAK_SLAB, VERTICAL_DARK_OAK_PLANKS, VERTICAL_DARK_OAK_STAIR, VERTICAL_DARK_OAK_SLAB);
            content.addAfter(ACACIA_SLAB, VERTICAL_ACACIA_PLANKS, VERTICAL_ACACIA_STAIR, VERTICAL_ACACIA_SLAB);
            content.addAfter(JUNGLE_SLAB, VERTICAL_JUNGLE_PLANKS, VERTICAL_JUNGLE_STAIR, VERTICAL_JUNGLE_SLAB);
            content.addAfter(CRIMSON_SLAB, VERTICAL_CRIMSON_PLANKS, VERTICAL_CRIMSON_STAIR, VERTICAL_CRIMSON_SLAB);
            content.addAfter(WARPED_SLAB, VERTICAL_WARPED_PLANKS, VERTICAL_WARPED_STAIR, VERTICAL_WARPED_SLAB);
            content.addAfter(MANGROVE_SLAB, VERTICAL_MANGROVE_PLANKS, VERTICAL_MANGROVE_STAIR, VERTICAL_MANGROVE_SLAB);
            content.addAfter(BAMBOO_SLAB, VERTICAL_BAMBOO_PLANKS, VERTICAL_BAMBOO_STAIR, VERTICAL_BAMBOO_SLAB);
            content.addAfter(CHERRY_SLAB, VERTICAL_CHERRY_PLANKS, VERTICAL_CHERRY_STAIR, VERTICAL_CHERRY_SLAB);

            /*Section 2: Mosaic Blocks*/

            content.addAfter(STRIPPED_OAK_WOOD, OAK_MOSAIC, OAK_MOSAIC_STAIRS, OAK_MOSAIC_SLABS);
            content.addAfter(STRIPPED_BIRCH_WOOD, BIRCH_MOSAIC, BIRCH_MOSAIC_STAIRS, BIRCH_MOSAIC_SLABS);
            content.addAfter(STRIPPED_SPRUCE_WOOD, SPRUCE_MOSAIC, SPRUCE_MOSAIC_STAIRS, SPRUCE_MOSAIC_SLABS);
            content.addAfter(STRIPPED_DARK_OAK_WOOD, DARK_OAK_MOSAIC, DARK_OAK_MOSAIC_STAIRS, DARK_OAK_MOSAIC_SLABS);
            content.addAfter(STRIPPED_JUNGLE_WOOD, JUNGLE_MOSAIC, JUNGLE_MOSAIC_STAIRS, JUNGLE_MOSAIC_SLABS);
            content.addAfter(STRIPPED_ACACIA_WOOD, ACACIA_MOSAIC,ACACIA_MOSAIC_STAIRS, ACACIA_MOSAIC_SLABS);
            content.addAfter(STRIPPED_CRIMSON_HYPHAE, CRIMSON_MOSAIC, CRIMSON_MOSAIC_STAIRS, CRIMSON_MOSAIC_SLABS);
            content.addAfter(STRIPPED_WARPED_HYPHAE, WARPED_MOSAIC, WARPED_MOSAIC_STAIRS, WARPED_MOSAIC_SLABS);
            content.addAfter(STRIPPED_MANGROVE_WOOD, MANGROVE_MOSAIC, MANGROVE_MOSAIC_STAIRS, MANGROVE_MOSAIC_SLABS);
            content.addAfter(STRIPPED_CHERRY_WOOD, CHERRY_MOSAIC, CHERRY_MOSAIC_STAIRS, CHERRY_MOSAIC_SLABS);

            /*Section 3: Lintels*/

            content.addAfter(VERTICAL_OAK_SLAB, OAK_FRAME, OAK_LINTELS);
            content.addAfter(VERTICAL_BIRCH_SLAB, BIRCH_FRAME, BIRCH_LINTELS);
            content.addAfter(VERTICAL_SPRUCE_SLAB, SPRUCE_FRAME, SPRUCE_LINTELS);
            content.addAfter(VERTICAL_DARK_OAK_SLAB, DARK_OAK_FRAME, DARK_OAK_LINTELS);
            content.addAfter(VERTICAL_JUNGLE_SLAB, JUNGLE_FRAME, JUNGLE_LINTELS);
            content.addAfter(VERTICAL_ACACIA_SLAB, ACACIA_FRAME, ACACIA_LINTELS);
            content.addAfter(VERTICAL_CRIMSON_SLAB, CRIMSON_FRAME, CRIMSON_LINTELS);
            content.addAfter(VERTICAL_WARPED_SLAB, WARPED_FRAME, WARPED_LINTELS);
            content.addAfter(VERTICAL_MANGROVE_SLAB, MANGROVE_FRAME, MANGROVE_LINTELS);
            content.addAfter(VERTICAL_BAMBOO_SLAB, BAMBOO_FRAME, BAMBOO_LINTELS);
            content.addAfter(VERTICAL_CHERRY_SLAB, CHERRY_FRAME, CHERRY_LINTELS);
            content.addAfter(VERTICAL_CACTUS_SLAB, CACTUS_FRAME, CACTUS_LINTELS);
            content.addAfter(VERTICAL_AZALEA_SLAB, AZALEA_FRAME, AZALEA_LINTELS);
            content.addAfter(VERTICAL_BLOOMING_AZALEA_SLAB, BLOOMING_AZALEA_FRAME, BLOOMING_AZALEA_LINTELS);

            /*Section 4: Engraved logs and wood*/

            content.addAfter(STRIPPED_OAK_WOOD, ENGRAVED_OAK, ENGRAVED_OAK_WOOD);
            content.addAfter(STRIPPED_BIRCH_WOOD, ENGRAVED_BIRCH, ENGRAVED_BIRCH_WOOD);
            content.addAfter(STRIPPED_SPRUCE_WOOD, ENGRAVED_SPRUCE, ENGRAVED_SPRUCE_WOOD);
            content.addAfter(STRIPPED_DARK_OAK_WOOD, ENGRAVED_DARK_OAK, ENGRAVED_DARK_OAK_WOOD);
            content.addAfter(STRIPPED_JUNGLE_WOOD, ENGRAVED_JUNGLE, ENGRAVED_JUNGLE_WOOD);
            content.addAfter(STRIPPED_ACACIA_WOOD, ENGRAVED_ACACIA, ENGRAVED_ACACIA_WOOD);
            content.addAfter(STRIPPED_CRIMSON_HYPHAE, ENGRAVED_CRIMSON, ENGRAVED_CRIMSON_HYPHAE);
            content.addAfter(STRIPPED_WARPED_HYPHAE, ENGRAVED_WARPED, ENGRAVED_WARPED_HYPHAE);
            content.addAfter(STRIPPED_MANGROVE_WOOD, ENGRAVED_MANGROVE, ENGRAVED_MANGROVE_WOOD);
            content.addAfter(STRIPPED_CHERRY_WOOD, ENGRAVED_CHERRY, ENGRAVED_CHERRY_WOOD);

            /*Section 5: Chipped logs, wood and planks*/
            content.addAfter(ENGRAVED_OAK_WOOD, CHIPPED_OAK, CHIPPED_OAK_WOOD, STRIPPED_CHIPPED_OAK, STRIPPED_CHIPPED_OAK_WOOD, CHIPPED_OAK_PLANKS, CHIPPED_OAK_STAIR, CHIPPED_OAK_SLAB);
            content.addAfter(ENGRAVED_BIRCH_WOOD, CHIPPED_BIRCH, CHIPPED_BIRCH_WOOD, STRIPPED_CHIPPED_BIRCH, STRIPPED_CHIPPED_BIRCH_WOOD, CHIPPED_BIRCH_PLANKS, CHIPPED_BIRCH_STAIR, CHIPPED_BIRCH_SLAB);
            content.addAfter(ENGRAVED_SPRUCE, CHIPPED_SPRUCE, CHIPPED_SPRUCE_WOOD, STRIPPED_CHIPPED_SPRUCE, STRIPPED_CHIPPED_SPRUCE_WOOD, CHIPPED_SPRUCE_PLANKS, CHIPPED_SPRUCE_STAIR, CHIPPED_SPRUCE_SLAB);
            content.addAfter(ENGRAVED_DARK_OAK_WOOD, CHIPPED_DARK_OAK, CHIPPED_DARK_OAK_WOOD, STRIPPED_CHIPPED_DARK_OAK, STRIPPED_CHIPPED_DARK_OAK_WOOD, CHIPPED_DARK_OAK_PLANKS, CHIPPED_DARK_OAK_STAIR, CHIPPED_DARK_OAK_SLAB);
            content.addAfter(ENGRAVED_JUNGLE, CHIPPED_JUNGLE, CHIPPED_JUNGLE_WOOD, STRIPPED_CHIPPED_JUNGLE, STRIPPED_CHIPPED_JUNGLE_WOOD, CHIPPED_JUNGLE_PLANKS, CHIPPED_JUNGLE_STAIR, CHIPPED_JUNGLE_SLAB);
            content.addAfter(ENGRAVED_ACACIA, CHIPPED_ACACIA, CHIPPED_ACACIA_WOOD, STRIPPED_CHIPPED_ACACIA, STRIPPED_CHIPPED_ACACIA_WOOD, CHIPPED_ACACIA_PLANKS, CHIPPED_ACACIA_STAIR, CHIPPED_ACACIA_SLAB);
            content.addAfter(ENGRAVED_CRIMSON_HYPHAE, CHIPPED_CRIMSON, CHIPPED_CRIMSON_HYPHAE, STRIPPED_CHIPPED_CRIMSON, STRIPPED_CHIPPED_CRIMSON_HYPHAE, CHIPPED_CRIMSON_PLANKS, CHIPPED_CRIMSON_STAIR, CHIPPED_CRIMSON_SLAB);
            content.addAfter(ENGRAVED_WARPED_HYPHAE, CHIPPED_WARPED, CHIPPED_WARPED_HYPHAE, STRIPPED_CHIPPED_WARPED, STRIPPED_CHIPPED_WARPED_HYPHAE, CHIPPED_WARPED_PLANKS, CHIPPED_WARPED_STAIR, CHIPPED_WARPED_SLAB);
            content.addAfter(ENGRAVED_MANGROVE_WOOD, CHIPPED_MANGROVE, CHIPPED_MANGROVE_WOOD, STRIPPED_CHIPPED_MANGROVE, STRIPPED_CHIPPED_MANGROVE_WOOD, CHIPPED_MANGROVE_PLANKS, CHIPPED_MANGROVE_STAIR, CHIPPED_MANGROVE_SLAB);
            content.addAfter(ENGRAVED_CHERRY_WOOD, CHIPPED_CHERRY, CHIPPED_CHERRY_WOOD, STRIPPED_CHIPPED_CHERRY, STRIPPED_CHIPPED_CHERRY_WOOD, CHIPPED_CHERRY_PLANKS, CHIPPED_CHERRY_STAIR, CHIPPED_CHERRY_SLAB);
            content.addAfter(BAMBOO_BLOCK, CHIPPED_BAMBOO_BLOCK, CHIPPED_BAMBOO_WOOD, CHIPPED_BAMBOO_PLANKS, CHIPPED_BAMBOO_STAIR, CHIPPED_BAMBOO_SLAB);
            content.addAfter(ENGRAVED_CACTUS_CROWN, CHIPPED_CACTUS, CHIPPED_CACTUS_CROWN, STRIPPED_CHIPPED_CACTUS, STRIPPED_CHIPPED_CACTUS_CROWN, CHIPPED_CACTUS_PLANKS, CHIPPED_CACTUS_STAIR, CHIPPED_CACTUS_SLAB);
            content.addAfter(ENGRAVED_AZALEA_WOOD, CHIPPED_AZALEA, CHIPPED_AZALEA_WOOD, STRIPPED_CHIPPED_AZALEA, STRIPPED_CHIPPED_AZALEA_WOOD, CHIPPED_AZALEA_PLANKS, CHIPPED_AZALEA_STAIR, CHIPPED_AZALEA_SLAB);

            /*Section 6: Plank Pavements*/
            content.addAfter(OAK_LINTELS, OAK_PLANK_PAVEMENT, OAK_PLANK_PILLARS, OAK_PLANK_BOX);
            content.addAfter(BIRCH_LINTELS, BIRCH_PLANK_PAVEMENT, BIRCH_PLANK_PILLARS, BIRCH_PLANK_BOX);
            content.addAfter(SPRUCE_LINTELS, SPRUCE_PLANK_PAVEMENT, SPRUCE_PLANK_PILLARS, SPRUCE_PLANK_BOX);
            content.addAfter(DARK_OAK_LINTELS, DARK_OAK_PLANK_PAVEMENT, DARK_OAK_PLANK_PILLARS, DARK_OAK_PLANK_BOX);
            content.addAfter(JUNGLE_LINTELS, JUNGLE_PLANK_PAVEMENT, JUNGLE_PLANK_PILLARS, JUNGLE_PLANK_BOX);
            content.addAfter(ACACIA_LINTELS, ACACIA_PLANK_PAVEMENT, ACACIA_PLANK_PILLARS, ACACIA_PLANK_BOX);
            content.addAfter(CRIMSON_LINTELS, CRIMSON_PLANK_PAVEMENT, CRIMSON_PLANK_PILLARS, CRIMSON_PLANK_BOX);
            content.addAfter(WARPED_LINTELS, WARPED_PLANK_PAVEMENT, WARPED_PLANK_PILLARS, WARPED_PLANK_BOX);
            content.addAfter(MANGROVE_LINTELS, MANGROVE_PLANK_PAVEMENT, MANGROVE_PLANK_PILLARS, MANGROVE_PLANK_BOX);
            content.addAfter(BAMBOO_LINTELS, BAMBOO_PLANK_PAVEMENT, BAMBOO_PLANK_PILLARS, BAMBOO_PLANK_BOX);
            content.addAfter(CHERRY_LINTELS, CHERRY_PLANK_PAVEMENT, CHERRY_PLANK_PILLARS, CHERRY_PLANK_BOX);
            content.addAfter(CACTUS_LINTELS, CACTUS_PLANK_PAVEMENT, CACTUS_PLANK_PILLARS, CACTUS_PLANK_BOX);
            content.addAfter(AZALEA_LINTELS, AZALEA_PLANK_PAVEMENT, AZALEA_PLANK_PILLARS, AZALEA_PLANK_BOX);
            content.addAfter(BLOOMING_AZALEA_LINTELS, BLOOMING_AZALEA_PLANK_PAVEMENT, BLOOMING_AZALEA_PLANK_PILLARS, BLOOMING_AZALEA_PLANK_BOX);

            /*Section 7: Boards, Tiles, Glazed, Carpented and Carved wood*/
            content.addAfter(OAK_PLANK_PAVEMENT, OAK_BOARDS, OAK_BOARDS_STAIRS, OAK_BOARDS_SLABS, OAK_TILES, OAK_TILES_STAIRS, OAK_TILES_SLABS, OAK_GLAZED, GLAZED_OAK_STAIRS, GLAZED_OAK_SLABS, CHISELED_OAK);

            /*Section 8: Barricades*/
            content.addAfter(OAK_FENCE_GATE, OAK_BARRICADES);

        });

        // Functional blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(STONECUTTER, SAWMILL));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> content.addAfter(WARPED_FUNGUS_ON_A_STICK, BLOCK_OF_PAPER, SOAKED_BLOCK_OF_PAPER));

        //Cactus woodset
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(WARPED_BUTTON, CACTUS_BUNDLE, CACTUS_CROWN, STRIPPED_CACTUS, STRIPPED_CACTUS_CROWN, ENGRAVED_CACTUS, ENGRAVED_CACTUS_CROWN,
                CACTUS_MOSAIC, CACTUS_MOSAIC_STAIRS, CACTUS_MOSAIC_SLABS, CACTUS_PLANKS, CACTUS_STAIRS, CACTUS_SLAB, VERTICAL_CACTUS_PLANKS, VERTICAL_CACTUS_STAIR,
                VERTICAL_CACTUS_SLAB, CACTUS_FENCE, CACTUS_FENCE_GATE, CACTUS_DOOR, CACTUS_TRAPDOOR, CACTUS_PRESSURE_PLATE, CACTUS_BUTTON
        ));

        //Azalea woodset
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(CACTUS_BUTTON, AZALEA_LOG, AZALEA_WOOD, STRIPPED_AZALEA_LOG, STRIPPED_AZALEA_WOOD, ENGRAVED_AZALEA, ENGRAVED_AZALEA_WOOD,
                AZALEA_MOSAIC, AZALEA_MOSAIC_STAIRS, AZALEA_MOSAIC_SLABS, BLOOMING_AZALEA_MOSAIC, BLOOMING_AZALEA_MOSAIC_STAIRS, BLOOMING_AZALEA_MOSAIC_SLABS, AZALEA_PLANKS, AZALEA_STAIRS, AZALEA_SLAB, BLOOMING_AZALEA_PLANKS,
                BLOOMING_AZALEA_STAIRS, BLOOMING_AZALEA_SLAB, VERTICAL_AZALEA_PLANKS, VERTICAL_AZALEA_STAIR, VERTICAL_AZALEA_SLAB, VERTICAL_BLOOMING_AZALEA_PLANKS, VERTICAL_BLOOMING_AZALEA_STAIR, VERTICAL_BLOOMING_AZALEA_SLAB, AZALEA_FENCE, AZALEA_FENCE_GATE, AZALEA_DOOR, BLOOMING_AZALEA_DOOR, AZALEA_TRAPDOOR, BLOOMING_AZALEA_TRAPDOOR,
                AZALEA_PRESSURE_PLATE, AZALEA_BUTTON
        ));
    }

}
