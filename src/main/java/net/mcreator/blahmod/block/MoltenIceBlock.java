
package net.mcreator.blahmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.procedures.SlowInMoltenIceProcedure;
import net.mcreator.blahmod.init.BlahmodModFluids;

public class MoltenIceBlock extends LiquidBlock {
	public MoltenIceBlock() {
		super(() -> BlahmodModFluids.MOLTEN_ICE.get(),
				BlockBehaviour.Properties.of(Material.WATER).strength(100f).lightLevel(s -> 15).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SlowInMoltenIceProcedure.execute(entity);
	}
}
