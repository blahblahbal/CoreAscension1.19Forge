
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.blahmod.world.features.plants.CoreRootsFeature;
import net.mcreator.blahmod.world.features.ores.TadaniteOreFeature;
import net.mcreator.blahmod.world.features.ores.RubyOreFeature;
import net.mcreator.blahmod.world.features.ores.NetherCoreGladeAirFeature;
import net.mcreator.blahmod.world.features.TropicsTreeFeature;
import net.mcreator.blahmod.world.features.SeashellGenFeature;
import net.mcreator.blahmod.world.features.SaltTerracesAirGenFeature;
import net.mcreator.blahmod.world.features.NetherCoreGroveAirGenFeature;
import net.mcreator.blahmod.world.features.ConchShellGenFeature;
import net.mcreator.blahmod.world.features.CedarTreeGenFeature;
import net.mcreator.blahmod.BlahmodMod;

@Mod.EventBusSubscriber
public class BlahmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BlahmodMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
	public static final RegistryObject<Feature<?>> TROPICS_TREE = REGISTRY.register("tropics_tree", TropicsTreeFeature::feature);
	public static final RegistryObject<Feature<?>> SEASHELL_GEN = REGISTRY.register("seashell_gen", SeashellGenFeature::feature);
	public static final RegistryObject<Feature<?>> CONCH_SHELL_GEN = REGISTRY.register("conch_shell_gen", ConchShellGenFeature::feature);
	public static final RegistryObject<Feature<?>> TADANITE_ORE = REGISTRY.register("tadanite_ore", TadaniteOreFeature::feature);
	public static final RegistryObject<Feature<?>> NETHER_CORE_GROVE_AIR = REGISTRY.register("nether_core_grove_air",
			NetherCoreGladeAirFeature::feature);
	public static final RegistryObject<Feature<?>> NETHER_CORE_GROVE_AIR_GEN = REGISTRY.register("nether_core_grove_air_gen",
			NetherCoreGroveAirGenFeature::feature);
	public static final RegistryObject<Feature<?>> SALT_TERRACES_AIR_GEN = REGISTRY.register("salt_terraces_air_gen",
			SaltTerracesAirGenFeature::feature);
	public static final RegistryObject<Feature<?>> CORE_ROOTS = REGISTRY.register("core_roots", CoreRootsFeature::feature);
	public static final RegistryObject<Feature<?>> CEDAR_TREE_GEN = REGISTRY.register("cedar_tree_gen", CedarTreeGenFeature::feature);
}
