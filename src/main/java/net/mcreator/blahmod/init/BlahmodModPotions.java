
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BlahmodMod.MODID);
	public static final RegistryObject<Potion> WARMTH_POTION_ITEM = REGISTRY.register("warmth_potion_item",
			() -> new Potion(new MobEffectInstance(BlahmodModMobEffects.WARMTH.get(), 3600, 0, false, true)));
}
