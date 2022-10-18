package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class NetherCoreGroveAirProProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double zs = 0;
		double ys = 0;
		double xs = 0;
		if (y >= 1) {
			zs = -64;
			for (int index0 = 0; index0 < (int) (128); index0++) {
				xs = -64;
				for (int index1 = 0; index1 < (int) (128); index1++) {
					ys = -32;
					for (int index2 = 0; index2 < (int) (64); index2++) {
						ys = ys + 1;
						NetherCoreGroveAirUpdateProcedure.execute(world, (x + xs), (y + ys), (z + zs));
					}
					xs = xs + 1;
				}
				zs = zs + 1;
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
