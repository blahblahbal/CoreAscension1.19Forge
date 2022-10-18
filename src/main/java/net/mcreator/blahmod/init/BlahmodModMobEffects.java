
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.blahmod.potion.WarmthMobEffect;
import net.mcreator.blahmod.potion.FreezingMobEffect;
import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BlahmodMod.MODID);
	public static final RegistryObject<MobEffect> FREEZING = REGISTRY.register("freezing", () -> new FreezingMobEffect());
	public static final RegistryObject<MobEffect> WARMTH = REGISTRY.register("warmth", () -> new WarmthMobEffect());
}
