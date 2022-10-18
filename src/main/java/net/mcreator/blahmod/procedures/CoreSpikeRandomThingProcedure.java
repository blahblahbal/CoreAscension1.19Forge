package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

public class CoreSpikeRandomThingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		rand = Math.random();
		if (rand < 0.25) {
			world.setBlock(new BlockPos(x, y, z), BlahmodModBlocks.NETHER_ICE.get().defaultBlockState(), 3);
		} else if (rand < 0.5) {
			world.setBlock(new BlockPos(x, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		} else if (rand < 0.75) {
			world.setBlock(new BlockPos(x, y, z), Blocks.ICE.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
	}
}
