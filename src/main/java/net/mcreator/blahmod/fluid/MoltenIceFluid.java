
package net.mcreator.blahmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.blahmod.init.BlahmodModItems;
import net.mcreator.blahmod.init.BlahmodModFluids;
import net.mcreator.blahmod.init.BlahmodModFluidTypes;
import net.mcreator.blahmod.init.BlahmodModBlocks;

public abstract class MoltenIceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BlahmodModFluidTypes.MOLTEN_ICE_TYPE.get(),
			() -> BlahmodModFluids.MOLTEN_ICE.get(), () -> BlahmodModFluids.FLOWING_MOLTEN_ICE.get()).explosionResistance(100f)
			.bucket(() -> BlahmodModItems.MOLTEN_ICE_BUCKET.get()).block(() -> (LiquidBlock) BlahmodModBlocks.MOLTEN_ICE.get());

	private MoltenIceFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_WATER;
	}

	public static class Source extends MoltenIceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenIceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
