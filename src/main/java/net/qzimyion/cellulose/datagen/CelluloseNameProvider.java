package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.qzimyion.cellulose.util.CelluloseStats;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseNameProvider extends FabricLanguageProvider
{

    public CelluloseNameProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");

    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //For mosaic blocks
        translationBuilder.add(OAK_MOSAIC, "Oak Mosaic");
        translationBuilder.add(BIRCH_MOSAIC, "Birch Mosaic");
        translationBuilder.add(SPRUCE_MOSAIC, "Spruce Mosaic");
        translationBuilder.add(DARK_OAK_MOSAIC, "Dark Oak Mosaic");
        translationBuilder.add(JUNGLE_MOSAIC, "Jungle Mosaic");
        translationBuilder.add(ACACIA_MOSAIC, "Acacia Mosaic");
        translationBuilder.add(CRIMSON_MOSAIC, "Crimson Mosaic");
        translationBuilder.add(WARPED_MOSAIC, "Warped Mosaic");
        translationBuilder.add(MANGROVE_MOSAIC, "Mangrove Mosaic");
        translationBuilder.add(CHERRY_MOSAIC, "Cherry Mosaic");
        //For mosaic stairs
        translationBuilder.add(OAK_MOSAIC_STAIRS, "Oak Mosaic Stairs");
        translationBuilder.add(BIRCH_MOSAIC_STAIRS, "Birch Mosaic Stairs");
        translationBuilder.add(SPRUCE_MOSAIC_STAIRS, "Spruce Mosaic Stairs");
        translationBuilder.add(DARK_OAK_MOSAIC_STAIRS, "Dark Oak Mosaic Stairs");
        translationBuilder.add(JUNGLE_MOSAIC_STAIRS, "Jungle Mosaic Stairs");
        translationBuilder.add(ACACIA_MOSAIC_STAIRS, "Acacia Mosaic Stairs");
        translationBuilder.add(CRIMSON_MOSAIC_STAIRS, "Crimson Mosaic Stairs");
        translationBuilder.add(WARPED_MOSAIC_STAIRS, "Warped Mosaic Stairs");
        translationBuilder.add(MANGROVE_MOSAIC_STAIRS, "Mangrove Mosaic Stairs");
        translationBuilder.add(CHERRY_MOSAIC_STAIRS, "Cherry Mosaic Stairs");
        //For mosaic slabs
        translationBuilder.add(OAK_MOSAIC_SLABS, "Oak Mosaic Slab");
        translationBuilder.add(BIRCH_MOSAIC_SLABS, "Birch Mosaic Slab");
        translationBuilder.add(SPRUCE_MOSAIC_SLABS, "Spruce Mosaic Slab");
        translationBuilder.add(DARK_OAK_MOSAIC_SLABS, "Dark Oak Mosaic Slab");
        translationBuilder.add(JUNGLE_MOSAIC_SLABS, "Jungle Mosaic Slab");
        translationBuilder.add(ACACIA_MOSAIC_SLABS, "Acacia Mosaic Slab");
        translationBuilder.add(CRIMSON_MOSAIC_SLABS, "Crimson Mosaic Slab");
        translationBuilder.add(WARPED_MOSAIC_SLABS, "Warped Mosaic Slab");
        translationBuilder.add(MANGROVE_MOSAIC_SLABS, "Mangrove Mosaic Slab");
        translationBuilder.add(CHERRY_MOSAIC_SLABS, "Cherry Mosaic Slab");
        //Sawmill
        translationBuilder.add(SAWMILL, "Sawmill");
        //Engraved logs and wood
        translationBuilder.add(ENGRAVED_OAK, "Engraved Oak Log");
        translationBuilder.add(ENGRAVED_BIRCH, "Engraved Birch Log");
        translationBuilder.add(ENGRAVED_SPRUCE, "Engraved Spruce Log");
        translationBuilder.add(ENGRAVED_JUNGLE, "Engraved Jungle Log");
        translationBuilder.add(ENGRAVED_ACACIA, "Engraved Acacia Log");
        translationBuilder.add(ENGRAVED_DARK_OAK, "Engraved Dark Oak Log");
        translationBuilder.add(ENGRAVED_CRIMSON, "Engraved Crimson Stem");
        translationBuilder.add(ENGRAVED_WARPED, "Engraved Warped Stem");
        translationBuilder.add(ENGRAVED_MANGROVE, "Engraved Mangrove Log");
        translationBuilder.add(ENGRAVED_CHERRY, "Engraved Cherry Log");
        translationBuilder.add(ENGRAVED_OAK_WOOD, "Engraved Oak Wood");
        translationBuilder.add(ENGRAVED_BIRCH_WOOD, "Engraved Birch Wood");
        translationBuilder.add(ENGRAVED_SPRUCE_WOOD, "Engraved Spruce Wood");
        translationBuilder.add(ENGRAVED_JUNGLE_WOOD, "Engraved Jungle Wood");
        translationBuilder.add(ENGRAVED_ACACIA_WOOD, "Engraved Acacia Wood");
        translationBuilder.add(ENGRAVED_DARK_OAK_WOOD, "Engraved Dark Oak Wood");
        translationBuilder.add(ENGRAVED_CRIMSON_HYPHAE, "Engraved Crimson Hyphae");
        translationBuilder.add(ENGRAVED_WARPED_HYPHAE, "Engraved Warped Hyphae");
        translationBuilder.add(ENGRAVED_MANGROVE_WOOD, "Engraved Mangrove Wood");
        translationBuilder.add(ENGRAVED_CHERRY_WOOD, "Engraved Cherry Wood");
        //Cactus Woodset
        translationBuilder.add(CACTUS_BUNDLE, "Cactus Bundle");
        translationBuilder.add(CACTUS_PLANKS, "Cactus Planks");
        translationBuilder.add(CACTUS_STAIRS, "Cactus Planks Stairs");
        translationBuilder.add(CACTUS_SLABS, "Cactus Planks Slab");
        translationBuilder.add(CACTUS_CROWN, "Cactus Crown");
        translationBuilder.add(STRIPPED_CACTUS, "Stripped Cactus");
        translationBuilder.add(STRIPPED_CACTUS_CROWN, "Stripped Cactus Crown");
        translationBuilder.add(CACTUS_FENCE, "Cactus Fence");
        translationBuilder.add(CACTUS_FENCE_GATE, "Cactus Fence gate");
        translationBuilder.add(CACTUS_BUTTON, "Cactus Button");
        translationBuilder.add(CACTUS_PRESSURE_PLATE, "Cactus Pressure Plate");
        translationBuilder.add(CACTUS_DOOR, "Cactus Door");
        translationBuilder.add(CACTUS_TRAPDOOR, "Cactus Trapdoor");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS, "Vertical Cactus Planks");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS_STAIRS, "Vertical Cactus Planks Stairs");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS_SLABS, "Vertical Cactus Planks Stairs");
        translationBuilder.add(ENGRAVED_CACTUS, "Engraved Cactus");
        translationBuilder.add(ENGRAVED_CACTUS_CROWN, "Engraved Cactus Crown");
        translationBuilder.add(CACTUS_MOSAIC, "Cactus Mosaic");
        translationBuilder.add(CACTUS_MOSAIC_STAIRS, "Cactus Mosaic Stairs");
        translationBuilder.add(CACTUS_MOSAIC_SLABS, "Cactus Mosaic Slab");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS, "Chipped Cactus Planks");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS_SLABS, "Chipped Cactus Planks Slab");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS_STAIRS, "Chipped Cactus Planks Stairs");
        translationBuilder.add(CACTUS_PLANK_PAVEMENT, "Cactus Pavement");
        translationBuilder.add(CACTUS_CARVED, "Carved cactus");
        translationBuilder.add(CACTUS_GLAZED, "Glazed Cactus");
        translationBuilder.add(GLAZED_CACTUS_STAIRS, "Glazed Cactus Stairs");
        translationBuilder.add(CACTUS_TILES, "Cactus Tiles");
        translationBuilder.add(CACTUS_TILES_STAIRS, "Cactus Tiles Stairs");
        translationBuilder.add(CACTUS_TILES_SLABS, "Cactus Tiles Slab");
        translationBuilder.add(CACTUS_BOARDS, "Cactus Boards");
        translationBuilder.add(CACTUS_BOARDS_STAIRS, "Cactus Boards Stairs");
        translationBuilder.add(CACTUS_BOARDS_SLABS, "Cactus Boards Slab");
        translationBuilder.add(CARPENTED_CACTUS, "Carpented Cactus");
        translationBuilder.add(CACTUS_BEAM, "Cactus Beam");
        translationBuilder.add(CACTUS_PLANK_PILLARS, "Cactus Plank Pillar");
        translationBuilder.add(VERTICAL_CACTUS_PLANK_PILLARS, "Vertical Cactus Plank Pillar");
        /*Stats*/
        translationBuilder.add(CelluloseStats.INTERACT_WITH_SAWMILL, "Interaction with sawmill");
        //Item
        translationBuilder.add(PIPIS, "[[PIPIS]]");
        //Chipped woodset
        translationBuilder.add(CHIPPED_OAK, "Chipped Oak Log");
        translationBuilder.add(CHIPPED_OAK_WOOD, "Chipped Oak Wood");
        translationBuilder.add(CHIPPED_BIRCH, "Chipped Birch Log");
        translationBuilder.add(CHIPPED_BIRCH_WOOD, "Chipped Birch Wood");
        translationBuilder.add(CHIPPED_SPRUCE, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_SPRUCE_WOOD, "Chipped Spruce Wood");
        translationBuilder.add(CHIPPED_DARK_OAK, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_DARK_OAK_WOOD, "Chipped Spruce Wood");
        translationBuilder.add(CHIPPED_JUNGLE, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_JUNGLE_WOOD, "Chipped spruce Wood");
        translationBuilder.add(CHIPPED_ACACIA, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_ACACIA_WOOD, "Chipped Spruce Wood");
        //Chipped Planks
        translationBuilder.add(CHIPPED_OAK_PLANKS, "Chipped Oak Planks");
        translationBuilder.add(CHIPPED_BIRCH_PLANKS, "Chipped Birch Planks");
        translationBuilder.add(CHIPPED_SPRUCE_PLANKS, "Chipped Spruce Planks");
        translationBuilder.add(CHIPPED_DARK_OAK_PLANKS, "Chipped Dark Oak Planks");
        translationBuilder.add(CHIPPED_JUNGLE_PLANKS, "Chipped Jungle Planks");
        translationBuilder.add(CHIPPED_ACACIA_PLANKS, "Chipped Acacia Planks");
        translationBuilder.add(CHIPPED_CRIMSON_PLANKS, "Chipped Crimson Planks");
        translationBuilder.add(CHIPPED_WARPED_PLANKS, "Chipped Warped Planks");
        translationBuilder.add(CHIPPED_MANGROVE_PLANKS, "Chipped Mangrove Planks");
        translationBuilder.add(CHIPPED_BAMBOO_PLANKS, "Chipped Bamboo Planks");
        translationBuilder.add(CHIPPED_CHERRY_PLANKS, "Chipped Cherry Planks");
        //Chipped Planks Slab
        translationBuilder.add(CHIPPED_OAK_PLANKS_SLABS, "Chipped Oak Planks Slab");
        translationBuilder.add(CHIPPED_BIRCH_PLANKS_SLABS, "Chipped Birch Planks Slab");
        translationBuilder.add(CHIPPED_SPRUCE_PLANKS_SLABS, "Chipped Spruce Planks Slab");
        translationBuilder.add(CHIPPED_DARK_OAK_PLANKS_SLABS, "Chipped Dark Oak Planks Slab");
        translationBuilder.add(CHIPPED_JUNGLE_PLANKS_SLABS, "Chipped Jungle Planks Slab");
        translationBuilder.add(CHIPPED_ACACIA_PLANKS_SLABS, "Chipped Acacia Planks Slab");
        translationBuilder.add(CHIPPED_CRIMSON_PLANKS_SLABS, "Chipped Crimson Planks Slab");
        translationBuilder.add(CHIPPED_WARPED_PLANKS_SLABS, "Chipped Warped Planks Slab");
        translationBuilder.add(CHIPPED_MANGROVE_PLANKS_SLABS, "Chipped Mangrove Planks Slab");
        translationBuilder.add(CHIPPED_BAMBOO_PLANKS_SLABS, "Chipped Bamboo Planks Slab");
        translationBuilder.add(CHIPPED_CHERRY_PLANKS_SLABS, "Chipped Cherry Planks Slab");
        //Chipped Planks
        translationBuilder.add(CHIPPED_OAK_PLANKS_STAIRS, "Chipped Oak Planks Stairs");
        translationBuilder.add(CHIPPED_BIRCH_PLANKS_STAIRS, "Chipped Birch Planks Stairs");
        translationBuilder.add(CHIPPED_SPRUCE_PLANKS_STAIRS, "Chipped Spruce Planks Stairs");
        translationBuilder.add(CHIPPED_DARK_OAK_PLANKS_STAIRS, "Chipped Dark Oak Planks Stairs");
        translationBuilder.add(CHIPPED_JUNGLE_PLANKS_STAIRS, "Chipped Jungle Planks Stairs");
        translationBuilder.add(CHIPPED_ACACIA_PLANKS_STAIRS, "Chipped Acacia Planks Stairs");
        translationBuilder.add(CHIPPED_CRIMSON_PLANKS_STAIRS, "Chipped Crimson Planks Stairs");
        translationBuilder.add(CHIPPED_WARPED_PLANKS_STAIRS, "Chipped Warped Planks Stairs");
        translationBuilder.add(CHIPPED_MANGROVE_PLANKS_STAIRS, "Chipped Mangrove Planks Stairs");
        translationBuilder.add(CHIPPED_BAMBOO_PLANKS_STAIRS, "Chipped Bamboo Planks Stairs");
        translationBuilder.add(CHIPPED_CHERRY_PLANKS_STAIRS, "Chipped Cherry Planks Stairs");
        //Pavements
        translationBuilder.add(OAK_PLANK_PAVEMENT, "Oak Pavement");
        translationBuilder.add(BIRCH_PLANK_PAVEMENT, "Birch Pavement");
        translationBuilder.add(SPRUCE_PLANK_PAVEMENT, "Spruce Pavement");
        translationBuilder.add(DARK_OAK_PLANK_PAVEMENT, "Dark Oak Pavement");
        translationBuilder.add(JUNGLE_PLANK_PAVEMENT, "Jungle Pavement");
        translationBuilder.add(ACACIA_PLANK_PAVEMENT, "Acacia Pavement");
        translationBuilder.add(CRIMSON_PLANK_PAVEMENT, "Crimson Pavement");
        translationBuilder.add(WARPED_PLANK_PAVEMENT, "Warped Pavement");
        translationBuilder.add(MANGROVE_PLANK_PAVEMENT, "Mangrove Pavement");
        translationBuilder.add(BAMBOO_PLANK_PAVEMENT, "Bamboo Pavement");
        translationBuilder.add(CHERRY_PLANK_PAVEMENT, "Cherry Pavement");
        //Carved Wood
        translationBuilder.add(OAK_CARVED, "Carved Oak");
        translationBuilder.add(BIRCH_CARVED, "Carved Birch");
        translationBuilder.add(SPRUCE_CARVED, "Carved Spruce");
        translationBuilder.add(DARK_OAK_CARVED, "Carved Dark Oak");
        translationBuilder.add(JUNGLE_CARVED, "Carved Jungle");
        translationBuilder.add(ACACIA_CARVED, "Carved Acacia");
        translationBuilder.add(CRIMSON_CARVED, "Carved Crimson");
        translationBuilder.add(WARPED_CARVED, "Carved Warped");
        translationBuilder.add(MANGROVE_CARVED, "Carved Mangrove");
        translationBuilder.add(BAMBOO_CARVED, "Carved Bamboo");
        translationBuilder.add(CHERRY_CARVED, "Carved Cherry");
        //Glazed Wood
        translationBuilder.add(OAK_GLAZED, "Glazed Oak");
        translationBuilder.add(BIRCH_GLAZED, "Glazed Birch");
        translationBuilder.add(SPRUCE_GLAZED, "Glazed Spruce");
        translationBuilder.add(DARK_OAK_GLAZED, "Glazed Dark Oak");
        translationBuilder.add(JUNGLE_GLAZED, "Glazed Jungle");
        translationBuilder.add(ACACIA_GLAZED, "Glazed Acacia");
        translationBuilder.add(CRIMSON_GLAZED, "Glazed Crimson");
        translationBuilder.add(WARPED_GLAZED, "Glazed Warped");
        translationBuilder.add(MANGROVE_GLAZED, "Glazed Mangrove");
        translationBuilder.add(BAMBOO_GLAZED, "Glazed Bamboo");
        translationBuilder.add(CHERRY_GLAZED, "Glazed Cherry");
        //Glazed Stairs
        translationBuilder.add(GLAZED_OAK_STAIRS, "Glazed Oak Stairs");
        translationBuilder.add(GLAZED_BIRCH_STAIRS, "Glazed Birch Stairs");
        translationBuilder.add(GLAZED_SPRUCE_STAIRS, "Glazed Spruce Stairs");
        translationBuilder.add(GLAZED_DARK_OAK_STAIRS, "Glazed Dark Oak Stairs");
        translationBuilder.add(GLAZED_JUNGLE_STAIRS, "Glazed Jungle Stairs");
        translationBuilder.add(GLAZED_ACACIA_STAIRS, "Glazed Acacia Stairs");
        translationBuilder.add(GLAZED_CRIMSON_STAIRS, "Glazed Crimson Stairs");
        translationBuilder.add(GLAZED_WARPED_STAIRS, "Glazed Warped Stairs");
        translationBuilder.add(GLAZED_MANGROVE_STAIRS, "Glazed Mangrove Stairs");
        translationBuilder.add(GLAZED_BAMBOO_STAIRS, "Glazed Bamboo Stairs");
        translationBuilder.add(GLAZED_CHERRY_STAIRS, "Glazed Cherry Stairs");
        //Glazed Slabs
        translationBuilder.add(GLAZED_OAK_SLABS, "Glazed Oak Slab");
        translationBuilder.add(GLAZED_BIRCH_SLABS, "Glazed Birch Slab");
        translationBuilder.add(GLAZED_SPRUCE_SLABS, "Glazed Spruce Slab");
        translationBuilder.add(GLAZED_DARK_OAK_SLABS, "Glazed Dark Oak Slab");
        translationBuilder.add(GLAZED_JUNGLE_SLABS, "Glazed Jungle Slab");
        translationBuilder.add(GLAZED_ACACIA_SLABS, "Glazed Acacia Slab");
        translationBuilder.add(GLAZED_CRIMSON_SLABS, "Glazed Crimson Slab");
        translationBuilder.add(GLAZED_WARPED_SLABS, "Glazed Warped Slab");
        translationBuilder.add(GLAZED_MANGROVE_SLABS, "Glazed Mangrove Slab");
        translationBuilder.add(GLAZED_BAMBOO_SLABS, "Glazed Bamboo Slab");
        translationBuilder.add(GLAZED_CHERRY_SLABS, "Glazed Cherry Slab");
        //Tiles
        translationBuilder.add(OAK_TILES, "Oak Tiles");
        translationBuilder.add(BIRCH_TILES, "Birch Tiles");
        translationBuilder.add(SPRUCE_TILES, "Spruce Tiles");
        translationBuilder.add(DARK_OAK_TILES, "Dark Oak Tiles");
        translationBuilder.add(JUNGLE_TILES, "Jungle Tiles");
        translationBuilder.add(ACACIA_TILES, "Acacia Tiles");
        translationBuilder.add(CRIMSON_TILES, "Crimson Tiles");
        translationBuilder.add(WARPED_TILES, "Warped Tiles");
        translationBuilder.add(MANGROVE_TILES, "Mangrove Tiles");
        translationBuilder.add(BAMBOO_TILES, "Bamboo Tiles");
        translationBuilder.add(CHERRY_TILES, "Cherry Tiles");
        //Tiles Stairs
        translationBuilder.add(OAK_TILES_STAIRS, "Oak Tiles Stairs");
        translationBuilder.add(BIRCH_TILES_STAIRS, "Birch Tiles Stairs");
        translationBuilder.add(SPRUCE_TILES_STAIRS, "Spruce Tiles Stairs");
        translationBuilder.add(DARK_OAK_TILES_STAIRS, "Dark Oak Tiles Stairs");
        translationBuilder.add(JUNGLE_TILES_STAIRS, "Jungle Tiles Stairs");
        translationBuilder.add(ACACIA_TILES_STAIRS, "Acacia Tiles Stairs");
        translationBuilder.add(CRIMSON_TILES_STAIRS, "Crimson Tiles Stairs");
        translationBuilder.add(WARPED_TILES_STAIRS, "Warped Tiles Stairs");
        translationBuilder.add(MANGROVE_TILES_STAIRS, "Mangrove Tiles Stairs");
        translationBuilder.add(BAMBOO_TILES_STAIRS, "Bamboo Tiles Stairs");
        translationBuilder.add(CHERRY_TILES_STAIRS, "Cherry Tiles Stairs");
        //Tiles Slab
        translationBuilder.add(OAK_TILES_SLABS, "Oak Tiles Slab");
        translationBuilder.add(BIRCH_TILES_SLABS, "Birch Tiles Slab");
        translationBuilder.add(SPRUCE_TILES_SLABS, "Spruce Tiles Slab");
        translationBuilder.add(DARK_OAK_TILES_SLABS, "Dark Oak Tiles Slab");
        translationBuilder.add(JUNGLE_TILES_SLABS, "Jungle Tiles Slab");
        translationBuilder.add(ACACIA_TILES_SLABS, "Acacia Tiles Slab");
        translationBuilder.add(CRIMSON_TILES_SLABS, "Crimson Tiles Slab");
        translationBuilder.add(WARPED_TILES_SLABS, "Warped Tiles Slab");
        translationBuilder.add(MANGROVE_TILES_SLABS, "Mangrove Tiles Slab");
        translationBuilder.add(BAMBOO_TILES_SLABS, "Bamboo Tiles Slab");
        translationBuilder.add(CHERRY_TILES_SLABS, "Cherry Tiles Slab");
        //Boards
        translationBuilder.add(OAK_BOARDS, "Oak Boards");
        translationBuilder.add(BIRCH_BOARDS, "Birch Boards");
        translationBuilder.add(SPRUCE_BOARDS, "Spruce Boards");
        translationBuilder.add(DARK_OAK_BOARDS, "Dark Oak Boards");
        translationBuilder.add(JUNGLE_BOARDS, "Jungle Boards");
        translationBuilder.add(ACACIA_BOARDS, "Acacia Boards");
        translationBuilder.add(CRIMSON_BOARDS, "Crimson Boards");
        translationBuilder.add(WARPED_BOARDS, "Warped Boards");
        translationBuilder.add(MANGROVE_BOARDS, "Mangrove Boards");
        translationBuilder.add(BAMBOO_BOARDS, "Bamboo Boards");
        translationBuilder.add(CHERRY_BOARDS, "Cherry Boards");
        //Board Stairs
        translationBuilder.add(OAK_BOARDS_STAIRS, "Oak Boards Stairs");
        translationBuilder.add(BIRCH_BOARDS_STAIRS, "Birch Boards Stairs");
        translationBuilder.add(SPRUCE_BOARDS_STAIRS, "Spruce Boards Stairs");
        translationBuilder.add(DARK_OAK_BOARDS_STAIRS, "Dark Oak Boards Stairs");
        translationBuilder.add(JUNGLE_BOARDS_STAIRS, "Jungle Boards Stairs");
        translationBuilder.add(ACACIA_BOARDS_STAIRS, "Acacia Boards Stairs");
        translationBuilder.add(CRIMSON_BOARDS_STAIRS, "Crimson Boards Stairs");
        translationBuilder.add(WARPED_BOARDS_STAIRS, "Warped Boards Stairs");
        translationBuilder.add(MANGROVE_BOARDS_STAIRS, "Mangrove Boards Stairs");
        translationBuilder.add(BAMBOO_BOARDS_STAIRS, "Bamboo Boards Stairs");
        translationBuilder.add(CHERRY_BOARDS_STAIRS, "Cherry Boards Stairs");
        //Board Slab
        translationBuilder.add(OAK_BOARDS_SLABS, "Oak Boards Slab");
        translationBuilder.add(BIRCH_BOARDS_SLABS, "Birch Boards Slab");
        translationBuilder.add(SPRUCE_BOARDS_SLABS, "Spruce Boards Slab");
        translationBuilder.add(DARK_OAK_BOARDS_SLABS, "Dark Oak Boards Slab");
        translationBuilder.add(JUNGLE_BOARDS_SLABS, "Jungle Boards Slab");
        translationBuilder.add(ACACIA_BOARDS_SLABS, "Acacia Boards Slab");
        translationBuilder.add(CRIMSON_BOARDS_SLABS, "Crimson Boards Slab");
        translationBuilder.add(WARPED_BOARDS_SLABS, "Warped Boards Slab");
        translationBuilder.add(MANGROVE_BOARDS_SLABS, "Mangrove Boards Slab");
        translationBuilder.add(BAMBOO_BOARDS_SLABS, "Bamboo Boards Slab");
        translationBuilder.add(CHERRY_BOARDS_SLABS, "Cherry Boards Slab");
        //Carpented wood
        translationBuilder.add(CARPENTED_OAK, "Carpented Oak");
        translationBuilder.add(CARPENTED_BIRCH, "Carpented Birch");
        translationBuilder.add(CARPENTED_SPRUCE, "Carpented Spruce");
        translationBuilder.add(CARPENTED_DARK_OAK, "Carpented Dark Oak");
        translationBuilder.add(CARPENTED_JUNGLE, "Carpented Jungle");
        translationBuilder.add(CARPENTED_ACACIA, "Carpented Acacia");
        translationBuilder.add(CARPENTED_CRIMSON, "Carpented Crimson");
        translationBuilder.add(CARPENTED_WARPED, "Carpented Warped");
        translationBuilder.add(CARPENTED_MANGROVE, "Carpented Mangrove");
        translationBuilder.add(CARPENTED_BAMBOO, "Carpented Bamboo");
        translationBuilder.add(CARPENTED_CHERRY, "Carpented Cherry");
        //Beams
        translationBuilder.add(OAK_BEAM, "Oak Beam");
        translationBuilder.add(BIRCH_BEAM, "Birch Beam");
        translationBuilder.add(SPRUCE_BEAM, "Spruce Beam");
        translationBuilder.add(DARK_OAK_BEAM, "Dark Oak Beam");
        translationBuilder.add(JUNGLE_BEAM, "Jungle Beam");
        translationBuilder.add(ACACIA_BEAM, "Acacia Beam");
        translationBuilder.add(CRIMSON_BEAM, "Crimson Beam");
        translationBuilder.add(WARPED_BEAM, "Warped Beam");
        translationBuilder.add(MANGROVE_BEAM, "Mangrove Beam");
        translationBuilder.add(BAMBOO_BEAM, "Bamboo Beam");
        translationBuilder.add(CHERRY_BEAM, "Cherry Beam");
        //Plank pillars
        translationBuilder.add(OAK_PLANK_PILLARS, "Oak Plank Pillar");
        translationBuilder.add(BIRCH_PLANK_PILLARS, "Birch Plank Pillar");
        translationBuilder.add(SPRUCE_PLANK_PILLARS, "Spruce Plank Pillar");
        translationBuilder.add(DARK_OAK_PLANK_PILLARS, "Dark Oak Plank Pillar");
        translationBuilder.add(JUNGLE_PLANK_PILLARS, "Jungle Plank Pillar");
        translationBuilder.add(ACACIA_PLANK_PILLARS, "Acacia Plank Pillar");
        translationBuilder.add(CRIMSON_PLANK_PILLARS, "Crimson Plank Pillar");
        translationBuilder.add(WARPED_PLANK_PILLARS, "Warped Plank Pillar");
        translationBuilder.add(MANGROVE_PLANK_PILLARS, "Mangrove Plank Pillar");
        translationBuilder.add(BAMBOO_PLANK_PILLARS, "Bamboo Plank Pillar");
        translationBuilder.add(CHERRY_PLANK_PILLARS, "Cherry Plank Pillar");
        //Vertical Plank pillars
        translationBuilder.add(VERTICAL_OAK_PLANK_PILLARS, "Vertical Oak Plank Pillar");
        translationBuilder.add(VERTICAL_BIRCH_PLANK_PILLARS, "Vertical Birch Plank Pillar");
        translationBuilder.add(VERTICAL_SPRUCE_PLANK_PILLARS, "Vertical Spruce Plank Pillar");
        translationBuilder.add(VERTICAL_DARK_OAK_PLANK_PILLARS, "Vertical Dark Oak Plank Pillar");
        translationBuilder.add(VERTICAL_JUNGLE_PLANK_PILLARS, "Vertical Jungle Plank Pillar");
        translationBuilder.add(VERTICAL_ACACIA_PLANK_PILLARS, "Vertical Acacia Plank Pillar");
        translationBuilder.add(VERTICAL_CRIMSON_PLANK_PILLARS, "Vertical Crimson Plank Pillar");
        translationBuilder.add(VERTICAL_WARPED_PLANK_PILLARS, "Vertical Warped Plank Pillar");
        translationBuilder.add(VERTICAL_MANGROVE_PLANK_PILLARS, "Vertical Mangrove Plank Pillar");
        translationBuilder.add(VERTICAL_BAMBOO_PLANK_PILLARS, "Vertical Bamboo Plank Pillar");
        translationBuilder.add(VERTICAL_CHERRY_PLANK_PILLARS, "Vertical Cherry Plank Pillar");

        /*
        Compressed Blocks
         */
        translationBuilder.add(BLOCK_OF_PAPER, "Paper Block");
        translationBuilder.add(SOAKED_BLOCK_OF_PAPER, "Soaked Paper Block");
        translationBuilder.add(BLOCK_OF_STICKS, "Stick Bundle");
        translationBuilder.add(BLOCK_OF_CHARCOAL, "Block Of Charcoal");
    }
}
