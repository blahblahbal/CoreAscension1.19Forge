
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.blahmod.block.WhitewoodWoodBlock;
import net.mcreator.blahmod.block.WhitewoodTrapdoorBlock;
import net.mcreator.blahmod.block.WhitewoodStairsBlock;
import net.mcreator.blahmod.block.WhitewoodSlabBlock;
import net.mcreator.blahmod.block.WhitewoodPressurePlateBlock;
import net.mcreator.blahmod.block.WhitewoodPlanksBlock;
import net.mcreator.blahmod.block.WhitewoodLogBlock;
import net.mcreator.blahmod.block.WhitewoodLeavesBlock;
import net.mcreator.blahmod.block.WhitewoodFenceGateBlock;
import net.mcreator.blahmod.block.WhitewoodFenceBlock;
import net.mcreator.blahmod.block.WhitewoodDoorBlock;
import net.mcreator.blahmod.block.WhitewoodButtonBlock;
import net.mcreator.blahmod.block.TropicsWoodBlock;
import net.mcreator.blahmod.block.TropicsTrapdoorBlock;
import net.mcreator.blahmod.block.TropicsStairsBlock;
import net.mcreator.blahmod.block.TropicsSlabBlock;
import net.mcreator.blahmod.block.TropicsPressurePlateBlock;
import net.mcreator.blahmod.block.TropicsPlanksBlock;
import net.mcreator.blahmod.block.TropicsLogBlock;
import net.mcreator.blahmod.block.TropicsLeavesBlock;
import net.mcreator.blahmod.block.TropicsFenceGateBlock;
import net.mcreator.blahmod.block.TropicsFenceBlock;
import net.mcreator.blahmod.block.TropicsDoorBlock;
import net.mcreator.blahmod.block.TropicsButtonBlock;
import net.mcreator.blahmod.block.TropicalGrassBlock;
import net.mcreator.blahmod.block.TadaniteOreBlock;
import net.mcreator.blahmod.block.TadaniteBlockBlock;
import net.mcreator.blahmod.block.SulphurOreNCBlock;
import net.mcreator.blahmod.block.StrippedWhitewoodWoodBlock;
import net.mcreator.blahmod.block.StrippedWhitewoodLogBlock;
import net.mcreator.blahmod.block.StrippedTropicsWoodBlock;
import net.mcreator.blahmod.block.StrippedTropicsLogBlock;
import net.mcreator.blahmod.block.StrippedFrostWoodBlock;
import net.mcreator.blahmod.block.StrippedFrostLogBlock;
import net.mcreator.blahmod.block.StrippedDreadWoodBlock;
import net.mcreator.blahmod.block.StrippedDreadLogBlock;
import net.mcreator.blahmod.block.StrippedCedarWoodBlock;
import net.mcreator.blahmod.block.StrippedCedarLogBlock;
import net.mcreator.blahmod.block.SoulSnowBlock;
import net.mcreator.blahmod.block.SmoothDreadSandstoneStairsBlock;
import net.mcreator.blahmod.block.SmoothDreadSandstoneSlabBlock;
import net.mcreator.blahmod.block.SmoothDreadSandstoneBlock;
import net.mcreator.blahmod.block.SmoothBlackSandstoneStairsBlock;
import net.mcreator.blahmod.block.SmoothBlackSandstoneSlabBlock;
import net.mcreator.blahmod.block.SmoothBlackSandstoneBlock;
import net.mcreator.blahmod.block.SeashellBlock;
import net.mcreator.blahmod.block.ScoriaBlock;
import net.mcreator.blahmod.block.SaltTerracesAirBlock;
import net.mcreator.blahmod.block.SaltBlock;
import net.mcreator.blahmod.block.RubyOreBlock;
import net.mcreator.blahmod.block.RubyBlockBlock;
import net.mcreator.blahmod.block.ReinforcedGlassPaneBlock;
import net.mcreator.blahmod.block.ReinforcedGlassBlock;
import net.mcreator.blahmod.block.ReinforcedChestBlock;
import net.mcreator.blahmod.block.PermaIceBlock;
import net.mcreator.blahmod.block.NetherfrostBlock;
import net.mcreator.blahmod.block.NetherIceBlock;
import net.mcreator.blahmod.block.NetherCorePortalBlock;
import net.mcreator.blahmod.block.NetherCoreGladeAirBlock;
import net.mcreator.blahmod.block.MoltenIceBlock;
import net.mcreator.blahmod.block.LushBlackSandBlock;
import net.mcreator.blahmod.block.LoamBlock;
import net.mcreator.blahmod.block.LightlyCharredScoriaBlock;
import net.mcreator.blahmod.block.HorizontalReinforcedGlassPaneBlock;
import net.mcreator.blahmod.block.FrozenMistBlock;
import net.mcreator.blahmod.block.FrostTrapdoorBlock;
import net.mcreator.blahmod.block.FrostStemBlock;
import net.mcreator.blahmod.block.FrostStairsBlock;
import net.mcreator.blahmod.block.FrostSlabBlock;
import net.mcreator.blahmod.block.FrostPlanksBlock;
import net.mcreator.blahmod.block.FrostHyphaeBlock;
import net.mcreator.blahmod.block.FrostFenceGateBlock;
import net.mcreator.blahmod.block.FrostFenceBlock;
import net.mcreator.blahmod.block.FrostDoorBlock;
import net.mcreator.blahmod.block.DreadWoodBlock;
import net.mcreator.blahmod.block.DreadTrapdoorBlock;
import net.mcreator.blahmod.block.DreadStairsBlock;
import net.mcreator.blahmod.block.DreadSlabBlock;
import net.mcreator.blahmod.block.DreadSandstoneWallBlock;
import net.mcreator.blahmod.block.DreadSandstoneStairsBlock;
import net.mcreator.blahmod.block.DreadSandstoneSlabBlock;
import net.mcreator.blahmod.block.DreadSandstoneBlock;
import net.mcreator.blahmod.block.DreadSandBlock;
import net.mcreator.blahmod.block.DreadRockBricksBlock;
import net.mcreator.blahmod.block.DreadRockBlock;
import net.mcreator.blahmod.block.DreadPressurePlateBlock;
import net.mcreator.blahmod.block.DreadPlanksBlock;
import net.mcreator.blahmod.block.DreadLogBlock;
import net.mcreator.blahmod.block.DreadFenceGateBlock;
import net.mcreator.blahmod.block.DreadFenceBlock;
import net.mcreator.blahmod.block.DreadDoorBlock;
import net.mcreator.blahmod.block.DreadButtonBlock;
import net.mcreator.blahmod.block.CutDreadSandstoneBlock;
import net.mcreator.blahmod.block.CutBlackSandstoneBlock;
import net.mcreator.blahmod.block.CorelightBlock;
import net.mcreator.blahmod.block.CoreWartBlockBlock;
import net.mcreator.blahmod.block.CoreVinesBlock;
import net.mcreator.blahmod.block.CoreRootsBlock;
import net.mcreator.blahmod.block.CoreNyliumBlock;
import net.mcreator.blahmod.block.CoreFungusBlock;
import net.mcreator.blahmod.block.ConchShellBlock;
import net.mcreator.blahmod.block.CoconutBlock;
import net.mcreator.blahmod.block.ChiseledDreadSandstoneBlock;
import net.mcreator.blahmod.block.ChiseledBlackSandstoneBlock;
import net.mcreator.blahmod.block.CharredScoriaBlock;
import net.mcreator.blahmod.block.CedarWoodBlock;
import net.mcreator.blahmod.block.CedarTrapdoorBlock;
import net.mcreator.blahmod.block.CedarStairsBlock;
import net.mcreator.blahmod.block.CedarSlabBlock;
import net.mcreator.blahmod.block.CedarPressurePlateBlock;
import net.mcreator.blahmod.block.CedarPlanksBlock;
import net.mcreator.blahmod.block.CedarLogBlock;
import net.mcreator.blahmod.block.CedarLeavesBlock;
import net.mcreator.blahmod.block.CedarFenceGateBlock;
import net.mcreator.blahmod.block.CedarFenceBlock;
import net.mcreator.blahmod.block.CedarDoorBlock;
import net.mcreator.blahmod.block.CedarButtonBlock;
import net.mcreator.blahmod.block.CactusTrapdoorBlock;
import net.mcreator.blahmod.block.CactusPlanksBlock;
import net.mcreator.blahmod.block.CactusDoorBlock;
import net.mcreator.blahmod.block.BorderlessGlassBlock;
import net.mcreator.blahmod.block.BlazeBrickBlock;
import net.mcreator.blahmod.block.BlackSandstoneWallBlock;
import net.mcreator.blahmod.block.BlackSandstoneStairsBlock;
import net.mcreator.blahmod.block.BlackSandstoneSlabBlock;
import net.mcreator.blahmod.block.BlackSandstoneBlock;
import net.mcreator.blahmod.block.BlackSandBlock;
import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlahmodMod.MODID);
	public static final RegistryObject<Block> BLACK_SAND = REGISTRY.register("black_sand", () -> new BlackSandBlock());
	public static final RegistryObject<Block> TROPICS_LOG = REGISTRY.register("tropics_log", () -> new TropicsLogBlock());
	public static final RegistryObject<Block> TROPICS_PLANKS = REGISTRY.register("tropics_planks", () -> new TropicsPlanksBlock());
	public static final RegistryObject<Block> TROPICS_LEAVES = REGISTRY.register("tropics_leaves", () -> new TropicsLeavesBlock());
	public static final RegistryObject<Block> BLACK_SANDSTONE = REGISTRY.register("black_sandstone", () -> new BlackSandstoneBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> TROPICS_SLAB = REGISTRY.register("tropics_slab", () -> new TropicsSlabBlock());
	public static final RegistryObject<Block> TROPICS_STAIRS = REGISTRY.register("tropics_stairs", () -> new TropicsStairsBlock());
	public static final RegistryObject<Block> TROPICS_FENCE = REGISTRY.register("tropics_fence", () -> new TropicsFenceBlock());
	public static final RegistryObject<Block> TROPICS_FENCE_GATE = REGISTRY.register("tropics_fence_gate", () -> new TropicsFenceGateBlock());
	public static final RegistryObject<Block> TROPICS_WOOD = REGISTRY.register("tropics_wood", () -> new TropicsWoodBlock());
	public static final RegistryObject<Block> TROPICS_DOOR = REGISTRY.register("tropics_door", () -> new TropicsDoorBlock());
	public static final RegistryObject<Block> TROPICS_TRAPDOOR = REGISTRY.register("tropics_trapdoor", () -> new TropicsTrapdoorBlock());
	public static final RegistryObject<Block> TROPICS_PRESSURE_PLATE = REGISTRY.register("tropics_pressure_plate",
			() -> new TropicsPressurePlateBlock());
	public static final RegistryObject<Block> TROPICS_BUTTON = REGISTRY.register("tropics_button", () -> new TropicsButtonBlock());
	public static final RegistryObject<Block> BLACK_SANDSTONE_SLAB = REGISTRY.register("black_sandstone_slab", () -> new BlackSandstoneSlabBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> DREAD_LOG = REGISTRY.register("dread_log", () -> new DreadLogBlock());
	public static final RegistryObject<Block> DREAD_PLANKS = REGISTRY.register("dread_planks", () -> new DreadPlanksBlock());
	public static final RegistryObject<Block> DREAD_SAND = REGISTRY.register("dread_sand", () -> new DreadSandBlock());
	public static final RegistryObject<Block> DREAD_SANDSTONE = REGISTRY.register("dread_sandstone", () -> new DreadSandstoneBlock());
	public static final RegistryObject<Block> CHISELED_BLACK_SANDSTONE = REGISTRY.register("chiseled_black_sandstone",
			() -> new ChiseledBlackSandstoneBlock());
	public static final RegistryObject<Block> BLACK_SANDSTONE_STAIRS = REGISTRY.register("black_sandstone_stairs",
			() -> new BlackSandstoneStairsBlock());
	public static final RegistryObject<Block> CUT_BLACK_SANDSTONE = REGISTRY.register("cut_black_sandstone", () -> new CutBlackSandstoneBlock());
	public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE = REGISTRY.register("smooth_black_sandstone",
			() -> new SmoothBlackSandstoneBlock());
	public static final RegistryObject<Block> BLACK_SANDSTONE_WALL = REGISTRY.register("black_sandstone_wall", () -> new BlackSandstoneWallBlock());
	public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_SLAB = REGISTRY.register("smooth_black_sandstone_slab",
			() -> new SmoothBlackSandstoneSlabBlock());
	public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_STAIRS = REGISTRY.register("smooth_black_sandstone_stairs",
			() -> new SmoothBlackSandstoneStairsBlock());
	public static final RegistryObject<Block> DREAD_SLAB = REGISTRY.register("dread_slab", () -> new DreadSlabBlock());
	public static final RegistryObject<Block> LUSH_BLACK_SAND = REGISTRY.register("lush_black_sand", () -> new LushBlackSandBlock());
	public static final RegistryObject<Block> COCONUT = REGISTRY.register("coconut", () -> new CoconutBlock());
	public static final RegistryObject<Block> SEASHELL = REGISTRY.register("seashell", () -> new SeashellBlock());
	public static final RegistryObject<Block> CONCH_SHELL = REGISTRY.register("conch_shell", () -> new ConchShellBlock());
	public static final RegistryObject<Block> REINFORCED_GLASS = REGISTRY.register("reinforced_glass", () -> new ReinforcedGlassBlock());
	public static final RegistryObject<Block> REINFORCED_GLASS_PANE = REGISTRY.register("reinforced_glass_pane",
			() -> new ReinforcedGlassPaneBlock());
	public static final RegistryObject<Block> HORIZONTAL_REINFORCED_GLASS_PANE = REGISTRY.register("horizontal_reinforced_glass_pane",
			() -> new HorizontalReinforcedGlassPaneBlock());
	public static final RegistryObject<Block> WHITEWOOD_LOG = REGISTRY.register("whitewood_log", () -> new WhitewoodLogBlock());
	public static final RegistryObject<Block> WHITEWOOD_PLANKS = REGISTRY.register("whitewood_planks", () -> new WhitewoodPlanksBlock());
	public static final RegistryObject<Block> WHITEWOOD_LEAVES = REGISTRY.register("whitewood_leaves", () -> new WhitewoodLeavesBlock());
	public static final RegistryObject<Block> WHITEWOOD_SLAB = REGISTRY.register("whitewood_slab", () -> new WhitewoodSlabBlock());
	public static final RegistryObject<Block> WHITEWOOD_STAIRS = REGISTRY.register("whitewood_stairs", () -> new WhitewoodStairsBlock());
	public static final RegistryObject<Block> WHITEWOOD_FENCE = REGISTRY.register("whitewood_fence", () -> new WhitewoodFenceBlock());
	public static final RegistryObject<Block> WHITEWOOD_FENCE_GATE = REGISTRY.register("whitewood_fence_gate", () -> new WhitewoodFenceGateBlock());
	public static final RegistryObject<Block> WHITEWOOD_DOOR = REGISTRY.register("whitewood_door", () -> new WhitewoodDoorBlock());
	public static final RegistryObject<Block> WHITEWOOD_TRAPDOOR = REGISTRY.register("whitewood_trapdoor", () -> new WhitewoodTrapdoorBlock());
	public static final RegistryObject<Block> WHITEWOOD_WOOD = REGISTRY.register("whitewood_wood", () -> new WhitewoodWoodBlock());
	public static final RegistryObject<Block> STRIPPED_WHITEWOOD_LOG = REGISTRY.register("stripped_whitewood_log",
			() -> new StrippedWhitewoodLogBlock());
	public static final RegistryObject<Block> STRIPPED_WHITEWOOD_WOOD = REGISTRY.register("stripped_whitewood_wood",
			() -> new StrippedWhitewoodWoodBlock());
	public static final RegistryObject<Block> STRIPPED_TROPICS_WOOD = REGISTRY.register("stripped_tropics_wood",
			() -> new StrippedTropicsWoodBlock());
	public static final RegistryObject<Block> STRIPPED_TROPICS_LOG = REGISTRY.register("stripped_tropics_log", () -> new StrippedTropicsLogBlock());
	public static final RegistryObject<Block> DREAD_STAIRS = REGISTRY.register("dread_stairs", () -> new DreadStairsBlock());
	public static final RegistryObject<Block> DREAD_FENCE = REGISTRY.register("dread_fence", () -> new DreadFenceBlock());
	public static final RegistryObject<Block> DREAD_FENCE_GATE = REGISTRY.register("dread_fence_gate", () -> new DreadFenceGateBlock());
	public static final RegistryObject<Block> DREAD_DOOR = REGISTRY.register("dread_door", () -> new DreadDoorBlock());
	public static final RegistryObject<Block> DREAD_TRAPDOOR = REGISTRY.register("dread_trapdoor", () -> new DreadTrapdoorBlock());
	public static final RegistryObject<Block> DREAD_SANDSTONE_SLAB = REGISTRY.register("dread_sandstone_slab", () -> new DreadSandstoneSlabBlock());
	public static final RegistryObject<Block> DREAD_SANDSTONE_STAIRS = REGISTRY.register("dread_sandstone_stairs",
			() -> new DreadSandstoneStairsBlock());
	public static final RegistryObject<Block> DREAD_SANDSTONE_WALL = REGISTRY.register("dread_sandstone_wall", () -> new DreadSandstoneWallBlock());
	public static final RegistryObject<Block> CUT_DREAD_SANDSTONE = REGISTRY.register("cut_dread_sandstone", () -> new CutDreadSandstoneBlock());
	public static final RegistryObject<Block> SMOOTH_DREAD_SANDSTONE = REGISTRY.register("smooth_dread_sandstone",
			() -> new SmoothDreadSandstoneBlock());
	public static final RegistryObject<Block> CHISELED_DREAD_SANDSTONE = REGISTRY.register("chiseled_dread_sandstone",
			() -> new ChiseledDreadSandstoneBlock());
	public static final RegistryObject<Block> SMOOTH_DREAD_SANDSTONE_SLAB = REGISTRY.register("smooth_dread_sandstone_slab",
			() -> new SmoothDreadSandstoneSlabBlock());
	public static final RegistryObject<Block> SMOOTH_DREAD_SANDSTONE_STAIRS = REGISTRY.register("smooth_dread_sandstone_stairs",
			() -> new SmoothDreadSandstoneStairsBlock());
	public static final RegistryObject<Block> STRIPPED_DREAD_WOOD = REGISTRY.register("stripped_dread_wood", () -> new StrippedDreadWoodBlock());
	public static final RegistryObject<Block> STRIPPED_DREAD_LOG = REGISTRY.register("stripped_dread_log", () -> new StrippedDreadLogBlock());
	public static final RegistryObject<Block> LOAM = REGISTRY.register("loam", () -> new LoamBlock());
	public static final RegistryObject<Block> TROPICAL_GRASS = REGISTRY.register("tropical_grass", () -> new TropicalGrassBlock());
	public static final RegistryObject<Block> NETHERFROST = REGISTRY.register("netherfrost", () -> new NetherfrostBlock());
	public static final RegistryObject<Block> SOUL_SNOW = REGISTRY.register("soul_snow", () -> new SoulSnowBlock());
	public static final RegistryObject<Block> FROST_WOOD_LOG = REGISTRY.register("frost_wood_log", () -> new FrostStemBlock());
	public static final RegistryObject<Block> CORE_WART_BLOCK = REGISTRY.register("core_wart_block", () -> new CoreWartBlockBlock());
	public static final RegistryObject<Block> CORELIGHT = REGISTRY.register("corelight", () -> new CorelightBlock());
	public static final RegistryObject<Block> CORE_NYLIUM = REGISTRY.register("core_nylium", () -> new CoreNyliumBlock());
	public static final RegistryObject<Block> NETHER_ICE = REGISTRY.register("nether_ice", () -> new NetherIceBlock());
	public static final RegistryObject<Block> SULPHUR_ORE_NC = REGISTRY.register("sulphur_ore_nc", () -> new SulphurOreNCBlock());
	public static final RegistryObject<Block> STRIPPED_FROST_WOOD = REGISTRY.register("stripped_frost_wood", () -> new StrippedFrostWoodBlock());
	public static final RegistryObject<Block> STRIPPED_FROST_LOG = REGISTRY.register("stripped_frost_log", () -> new StrippedFrostLogBlock());
	public static final RegistryObject<Block> FROST_PLANKS = REGISTRY.register("frost_planks", () -> new FrostPlanksBlock());
	public static final RegistryObject<Block> FROST_SLAB = REGISTRY.register("frost_slab", () -> new FrostSlabBlock());
	public static final RegistryObject<Block> FROST_STAIRS = REGISTRY.register("frost_stairs", () -> new FrostStairsBlock());
	public static final RegistryObject<Block> FROST_FENCE = REGISTRY.register("frost_fence", () -> new FrostFenceBlock());
	public static final RegistryObject<Block> FROST_FENCE_GATE = REGISTRY.register("frost_fence_gate", () -> new FrostFenceGateBlock());
	public static final RegistryObject<Block> TADANITE_ORE = REGISTRY.register("tadanite_ore", () -> new TadaniteOreBlock());
	public static final RegistryObject<Block> MOLTEN_ICE = REGISTRY.register("molten_ice", () -> new MoltenIceBlock());
	public static final RegistryObject<Block> NETHER_CORE_PORTAL = REGISTRY.register("nether_core_portal", () -> new NetherCorePortalBlock());
	public static final RegistryObject<Block> CORE_FUNGUS = REGISTRY.register("core_fungus", () -> new CoreFungusBlock());
	public static final RegistryObject<Block> CORE_VINE = REGISTRY.register("core_vine", () -> new CoreVinesBlock());
	public static final RegistryObject<Block> NETHER_CORE_GROVE_AIR = REGISTRY.register("nether_core_grove_air", () -> new NetherCoreGladeAirBlock());
	public static final RegistryObject<Block> SALT = REGISTRY.register("salt", () -> new SaltBlock());
	public static final RegistryObject<Block> SALT_DELTAS_AIR = REGISTRY.register("salt_deltas_air", () -> new SaltTerracesAirBlock());
	public static final RegistryObject<Block> PERMA_ICE = REGISTRY.register("perma_ice", () -> new PermaIceBlock());
	public static final RegistryObject<Block> TADANITE_BLOCK = REGISTRY.register("tadanite_block", () -> new TadaniteBlockBlock());
	public static final RegistryObject<Block> FROST_HYPHAE = REGISTRY.register("frost_hyphae", () -> new FrostHyphaeBlock());
	public static final RegistryObject<Block> FROST_DOOR = REGISTRY.register("frost_door", () -> new FrostDoorBlock());
	public static final RegistryObject<Block> FROST_TRAPDOOR = REGISTRY.register("frost_trapdoor", () -> new FrostTrapdoorBlock());
	public static final RegistryObject<Block> CACTUS_PLANKS = REGISTRY.register("cactus_planks", () -> new CactusPlanksBlock());
	public static final RegistryObject<Block> CACTUS_DOOR = REGISTRY.register("cactus_door", () -> new CactusDoorBlock());
	public static final RegistryObject<Block> CACTUS_TRAPDOOR = REGISTRY.register("cactus_trapdoor", () -> new CactusTrapdoorBlock());
	public static final RegistryObject<Block> CEDAR_LOG = REGISTRY.register("cedar_log", () -> new CedarLogBlock());
	public static final RegistryObject<Block> CEDAR_WOOD = REGISTRY.register("cedar_wood", () -> new CedarWoodBlock());
	public static final RegistryObject<Block> CEDAR_LEAVES = REGISTRY.register("cedar_leaves", () -> new CedarLeavesBlock());
	public static final RegistryObject<Block> DREAD_WOOD = REGISTRY.register("dread_wood", () -> new DreadWoodBlock());
	public static final RegistryObject<Block> STRIPPED_CEDAR_WOOD = REGISTRY.register("stripped_cedar_wood", () -> new StrippedCedarWoodBlock());
	public static final RegistryObject<Block> STRIPPED_CEDAR_LOG = REGISTRY.register("stripped_cedar_log", () -> new StrippedCedarLogBlock());
	public static final RegistryObject<Block> CEDAR_PLANKS = REGISTRY.register("cedar_planks", () -> new CedarPlanksBlock());
	public static final RegistryObject<Block> CEDAR_SLAB = REGISTRY.register("cedar_slab", () -> new CedarSlabBlock());
	public static final RegistryObject<Block> CEDAR_STAIRS = REGISTRY.register("cedar_stairs", () -> new CedarStairsBlock());
	public static final RegistryObject<Block> CEDAR_FENCE = REGISTRY.register("cedar_fence", () -> new CedarFenceBlock());
	public static final RegistryObject<Block> DREAD_PRESSURE_PLATE = REGISTRY.register("dread_pressure_plate", () -> new DreadPressurePlateBlock());
	public static final RegistryObject<Block> DREAD_BUTTON = REGISTRY.register("dread_button", () -> new DreadButtonBlock());
	public static final RegistryObject<Block> CEDAR_FENCE_GATE = REGISTRY.register("cedar_fence_gate", () -> new CedarFenceGateBlock());
	public static final RegistryObject<Block> CEDAR_PRESSURE_PLATE = REGISTRY.register("cedar_pressure_plate", () -> new CedarPressurePlateBlock());
	public static final RegistryObject<Block> CEDAR_BUTTON = REGISTRY.register("cedar_button", () -> new CedarButtonBlock());
	public static final RegistryObject<Block> CEDAR_DOOR = REGISTRY.register("cedar_door", () -> new CedarDoorBlock());
	public static final RegistryObject<Block> CEDAR_TRAPDOOR = REGISTRY.register("cedar_trapdoor", () -> new CedarTrapdoorBlock());
	public static final RegistryObject<Block> WHITEWOOD_PRESSURE_PLATE = REGISTRY.register("whitewood_pressure_plate",
			() -> new WhitewoodPressurePlateBlock());
	public static final RegistryObject<Block> WHITEWOOD_BUTTON = REGISTRY.register("whitewood_button", () -> new WhitewoodButtonBlock());
	public static final RegistryObject<Block> CORE_ROOTS = REGISTRY.register("core_roots", () -> new CoreRootsBlock());
	public static final RegistryObject<Block> SCORIA = REGISTRY.register("scoria", () -> new ScoriaBlock());
	public static final RegistryObject<Block> LIGHTLY_CHARRED_SCORIA = REGISTRY.register("lightly_charred_scoria",
			() -> new LightlyCharredScoriaBlock());
	public static final RegistryObject<Block> CHARRED_SCORIA = REGISTRY.register("charred_scoria", () -> new CharredScoriaBlock());
	public static final RegistryObject<Block> FROZEN_MIST = REGISTRY.register("frozen_mist", () -> new FrozenMistBlock());
	public static final RegistryObject<Block> DREAD_ROCK = REGISTRY.register("dread_rock", () -> new DreadRockBlock());
	public static final RegistryObject<Block> DREAD_ROCK_BRICKS = REGISTRY.register("dread_rock_bricks", () -> new DreadRockBricksBlock());
	public static final RegistryObject<Block> REINFORCED_CHEST = REGISTRY.register("reinforced_chest", () -> new ReinforcedChestBlock());
	public static final RegistryObject<Block> BLAZE_BRICK = REGISTRY.register("blaze_brick", () -> new BlazeBrickBlock());
	public static final RegistryObject<Block> BORDERLESS_GLASS = REGISTRY.register("borderless_glass", () -> new BorderlessGlassBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			LushBlackSandBlock.blockColorLoad(event);
			TropicalGrassBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			LushBlackSandBlock.itemColorLoad(event);
			TropicalGrassBlock.itemColorLoad(event);
		}
	}
}
