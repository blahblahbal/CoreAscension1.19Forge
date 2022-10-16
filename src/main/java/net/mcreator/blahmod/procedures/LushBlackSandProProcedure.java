package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

import java.util.Map;

public class LushBlackSandProProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() instanceof SimpleWaterloggedBlock
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.PLANT
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.REPLACEABLE_PLANT
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WALL_TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.SOUL_TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.SOUL_WALL_TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.REDSTONE_TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.REDSTONE_WALL_TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.REDSTONE_TORCH)) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = BlahmodModBlocks.BLACK_SAND.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = BlahmodModBlocks.BLACK_SAND.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
