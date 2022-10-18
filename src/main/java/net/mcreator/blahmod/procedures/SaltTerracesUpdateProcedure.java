package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

import java.util.Map;

public class SaltTerracesUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double maxheight = 0;
		double sz = 0;
		double width = 0;
		double circle1 = 0;
		double height = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == BlahmodModBlocks.SALT.get()) {
			if (Math.random() < 0.0075) {
				circle1 = -3;
				for (int index0 = 0; index0 < (int) (6); index0++) {
					sz = -3;
					for (int index1 = 0; index1 < (int) (6); index1++) {
						{
							BlockPos _bp = new BlockPos(x + circle1, y - 1, z + sz);
							BlockState _bs = BlahmodModBlocks.FROZEN_MIST.get().defaultBlockState();
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
						if (circle1 == -3 && sz >= -3 && sz <= 2 || circle1 == 2 && sz >= -3 && sz <= 2 || sz == -3 && circle1 >= -3 && circle1 <= 2
								|| sz == 2 && circle1 >= -3 && circle1 <= 2) {
							{
								BlockPos _bp = new BlockPos(x + circle1, y - 1, z + sz);
								BlockState _bs = BlahmodModBlocks.SALT.get().defaultBlockState();
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
						if (circle1 <= 2 && circle1 >= -2 && sz <= 2 && sz >= -2) {
							{
								BlockPos _bp = new BlockPos(x + circle1, y - 2, z + sz);
								BlockState _bs = BlahmodModBlocks.SALT.get().defaultBlockState();
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
						sz = sz + 1;
					}
					circle1 = circle1 + 1;
				}
			}
			if (Math.random() < 0.005) {
				width = 1;
				maxheight = Math.random() * 15;
				for (int index2 = 0; index2 < (int) (maxheight); index2++) {
					if (width == 1) {
						CoreSpikeRandomThingProcedure.execute(world, x, (y + height), z);
						CoreSpikeRandomThingProcedure.execute(world, (x + 1), (y + height), z);
						CoreSpikeRandomThingProcedure.execute(world, (x - 1), (y + height), z);
						CoreSpikeRandomThingProcedure.execute(world, x, (y + height), (z + 1));
						CoreSpikeRandomThingProcedure.execute(world, x, (y + height), (z - 1));
						if (Math.random() < 0.3) {
							width = 0;
						}
						if (height >= maxheight * 0.5) {
							width = 0;
						}
					} else {
						CoreSpikeRandomThingProcedure.execute(world, x, (y + height), z);
					}
					height = height + 1;
				}
			}
		}
	}
}
