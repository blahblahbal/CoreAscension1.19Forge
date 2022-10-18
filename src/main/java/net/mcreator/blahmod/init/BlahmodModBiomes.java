
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.blahmod.world.biome.ValleyOfTheDamnedBiome;
import net.mcreator.blahmod.world.biome.TropicsBiome;
import net.mcreator.blahmod.world.biome.SoulSnowFlatsBiome;
import net.mcreator.blahmod.world.biome.ScoriaCaveBiome;
import net.mcreator.blahmod.world.biome.SaltTerracesBiome;
import net.mcreator.blahmod.world.biome.NetherCoreTundraBiome;
import net.mcreator.blahmod.world.biome.CoreGroveBiome;
import net.mcreator.blahmod.world.biome.CedarGroveBiome;
import net.mcreator.blahmod.BlahmodMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber
public class BlahmodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BlahmodMod.MODID);
	public static final RegistryObject<Biome> TROPICS = REGISTRY.register("tropics", () -> TropicsBiome.createBiome());
	public static final RegistryObject<Biome> NETHER_CORE_TUNDRA = REGISTRY.register("nether_core_tundra", () -> NetherCoreTundraBiome.createBiome());
	public static final RegistryObject<Biome> SOUL_SNOW_FLATS = REGISTRY.register("soul_snow_flats", () -> SoulSnowFlatsBiome.createBiome());
	public static final RegistryObject<Biome> CORE_GROVE = REGISTRY.register("core_grove", () -> CoreGroveBiome.createBiome());
	public static final RegistryObject<Biome> SALT_TERRACES = REGISTRY.register("salt_terraces", () -> SaltTerracesBiome.createBiome());
	public static final RegistryObject<Biome> VALLEY_OF_THE_DAMNED = REGISTRY.register("valley_of_the_damned",
			() -> ValleyOfTheDamnedBiome.createBiome());
	public static final RegistryObject<Biome> CEDAR_GROVE = REGISTRY.register("cedar_grove", () -> CedarGroveBiome.createBiome());
	public static final RegistryObject<Biome> SCORIA_CAVE = REGISTRY.register("scoria_cave", () -> ScoriaCaveBiome.createBiome());

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					parameters.add(new Pair<>(TropicsBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, TROPICS.getId()))));
					parameters.add(new Pair<>(ValleyOfTheDamnedBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, VALLEY_OF_THE_DAMNED.getId()))));
					parameters.add(new Pair<>(CedarGroveBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, CEDAR_GROVE.getId()))));

					chunkGenerator.biomeSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, TROPICS.getId()),
								BlahmodModBlocks.BLACK_SAND.get().defaultBlockState(), BlahmodModBlocks.BLACK_SANDSTONE.get().defaultBlockState(),
								BlahmodModBlocks.BLACK_SANDSTONE.get().defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, VALLEY_OF_THE_DAMNED.getId()),
										BlahmodModBlocks.DREAD_SAND.get().defaultBlockState(), BlahmodModBlocks.DREAD_ROCK.get().defaultBlockState(),
										BlahmodModBlocks.DREAD_SANDSTONE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CEDAR_GROVE.getId()),
								Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
								noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(), noiseGeneratorSettings.noiseRouter(),
								SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
								noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(),
								noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
					}
				}
			}

		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock,
			BlockState underwaterBlock) {
		return SurfaceRules
				.ifTrue(SurfaceRules.isBiome(biomeKey),
						SurfaceRules
								.ifTrue(SurfaceRules.abovePreliminarySurface(),
										SurfaceRules.sequence(
												SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
														SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
												SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
														SurfaceRules.state(undergroundBlock)))));
	}
}
