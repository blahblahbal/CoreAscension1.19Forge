
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BlahmodMod.MODID);
	public static final RegistryObject<SoundEvent> CACTUS_PLANKS_BREAK = REGISTRY.register("cactus_planks_break",
			() -> new SoundEvent(new ResourceLocation("blahmod", "cactus_planks_break")));
	public static final RegistryObject<SoundEvent> CACTUS_PLANKS_HIT = REGISTRY.register("cactus_planks_hit",
			() -> new SoundEvent(new ResourceLocation("blahmod", "cactus_planks_hit")));
	public static final RegistryObject<SoundEvent> CACTUS_PLANKS_PLACE = REGISTRY.register("cactus_planks_place",
			() -> new SoundEvent(new ResourceLocation("blahmod", "cactus_planks_place")));
	public static final RegistryObject<SoundEvent> CACTUS_PLANKS_STEP = REGISTRY.register("cactus_planks_step",
			() -> new SoundEvent(new ResourceLocation("blahmod", "cactus_planks_step")));
}
