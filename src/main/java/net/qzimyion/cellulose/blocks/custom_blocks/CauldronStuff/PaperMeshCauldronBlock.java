package net.qzimyion.cellulose.blocks.custom_blocks.CauldronStuff;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings("deprecation")
public class PaperMeshCauldronBlock extends AbstractCauldronBlock {
    public PaperMeshCauldronBlock(Settings settings) {
        super(settings, ModBlockProperties.PAPER_MESH_CAULDRON_BEHAVIOR);
    }
    public boolean isFull(BlockState state) {
        return true;
    }
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }


    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(Blocks.CAULDRON);
    }
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 4;
    }
}