package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

public class LoamGrassSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z))
				&& ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get()
						|| (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == BlahmodModBlocks.TROPICAL_GRASS.get())) {
			world.setBlock(new BlockPos(x, y, z), BlahmodModBlocks.TROPICAL_GRASS.get().defaultBlockState(), 3);
		}
	}
}
