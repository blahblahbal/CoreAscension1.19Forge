package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

import java.util.Map;

public class CoreVineGroundVineThingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double maxheight = 0;
		double height = 0;
		height = 0;
		maxheight = Math.random() * 10;
		for (int index0 = 0; index0 < (int) (maxheight); index0++) {
			if ((world.getBlockState(new BlockPos(x, y + height + 1, z))).getBlock() == BlahmodModBlocks.NETHERFROST.get()) {
				break;
			}
			{
				BlockPos _bp = new BlockPos(x, y + height, z);
				BlockState _bs = BlahmodModBlocks.CORE_VINE.get().defaultBlockState();
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
			{
				BlockPos _bp = new BlockPos(x, y + height + 1, z);
				BlockState _bs = BlahmodModBlocks.CORE_VINE.get().defaultBlockState();
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
			height = height + 1;
		}
	}
}
