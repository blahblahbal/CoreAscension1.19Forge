
package net.mcreator.blahmod.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.blahmod.init.BlahmodModBlocks;

import java.util.Set;
import java.util.List;

public class NetherCoreGladeAirFeature extends OreFeature {
	public static NetherCoreGladeAirFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new NetherCoreGladeAirFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("blahmod:nether_core_grove_air", FEATURE, new OreConfiguration(
				NetherCoreGladeAirFeatureRuleTest.INSTANCE, BlahmodModBlocks.NETHER_CORE_GROVE_AIR.get().defaultBlockState(), 1));
		PLACED_FEATURE = PlacementUtils.register("blahmod:nether_core_grove_air", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(1), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("blahmod:nether_core")));

	public NetherCoreGladeAirFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class NetherCoreGladeAirFeatureRuleTest extends RuleTest {
		static final NetherCoreGladeAirFeatureRuleTest INSTANCE = new NetherCoreGladeAirFeatureRuleTest();
		private static final com.mojang.serialization.Codec<NetherCoreGladeAirFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<NetherCoreGladeAirFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("blahmod:nether_core_grove_air_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, RandomSource random) {
			if (base_blocks == null) {
				base_blocks = List.of(BlahmodModBlocks.NETHERFROST.get());
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
