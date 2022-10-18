
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.blahmod.fluid.types.MoltenIceFluidType;
import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BlahmodMod.MODID);
	public static final RegistryObject<FluidType> MOLTEN_ICE_TYPE = REGISTRY.register("molten_ice", () -> new MoltenIceFluidType());
}
