
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
import net.mcreator.blahmod.block.WhitewoodPlanksBlock;
import net.mcreator.blahmod.block.WhitewoodLogBlock;
import net.mcreator.blahmod.block.WhitewoodLeavesBlock;
import net.mcreator.blahmod.block.WhitewoodFenceGateBlock;
import net.mcreator.blahmod.block.WhitewoodFenceBlock;
import net.mcreator.blahmod.block.WhitewoodDoorBlock;
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
import net.mcreator.blahmod.block.StrippedWhitewoodWoodBlock;
import net.mcreator.blahmod.block.StrippedWhitewoodLogBlock;
import net.mcreator.blahmod.block.StrippedTropicsWoodBlock;
import net.mcreator.blahmod.block.StrippedTropicsLogBlock;
import net.mcreator.blahmod.block.StrippedDreadWoodBlock;
import net.mcreator.blahmod.block.StrippedDreadLogBlock;
import net.mcreator.blahmod.block.SoulSnowBlock;
import net.mcreator.blahmod.block.SmoothDreadSandstoneStairsBlock;
import net.mcreator.blahmod.block.SmoothDreadSandstoneSlabBlock;
import net.mcreator.blahmod.block.SmoothDreadSandstoneBlock;
import net.mcreator.blahmod.block.SmoothBlackSandstoneStairsBlock;
import net.mcreator.blahmod.block.SmoothBlackSandstoneSlabBlock;
import net.mcreator.blahmod.block.SmoothBlackSandstoneBlock;
import net.mcreator.blahmod.block.SeashellBlock;
import net.mcreator.blahmod.block.RubyOreBlock;
import net.mcreator.blahmod.block.RubyBlockBlock;
import net.mcreator.blahmod.block.ReinforcedGlassPaneBlock;
import net.mcreator.blahmod.block.ReinforcedGlassBlock;
import net.mcreator.blahmod.block.NetherfrostBlock;
import net.mcreator.blahmod.block.LushBlackSandBlock;
import net.mcreator.blahmod.block.LoamBlock;
import net.mcreator.blahmod.block.HorizontalReinforcedGlassPaneBlock;
import net.mcreator.blahmod.block.DreadTrapdoorBlock;
import net.mcreator.blahmod.block.DreadStairsBlock;
import net.mcreator.blahmod.block.DreadSlabBlock;
import net.mcreator.blahmod.block.DreadSandstoneWallBlock;
import net.mcreator.blahmod.block.DreadSandstoneStairsBlock;
import net.mcreator.blahmod.block.DreadSandstoneSlabBlock;
import net.mcreator.blahmod.block.DreadSandstoneBlock;
import net.mcreator.blahmod.block.DreadSandBlock;
import net.mcreator.blahmod.block.DreadPlanksBlock;
import net.mcreator.blahmod.block.DreadLogBlock;
import net.mcreator.blahmod.block.DreadFenceGateBlock;
import net.mcreator.blahmod.block.DreadFenceBlock;
import net.mcreator.blahmod.block.DreadDoorBlock;
import net.mcreator.blahmod.block.CutDreadSandstoneBlock;
import net.mcreator.blahmod.block.CutBlackSandstoneBlock;
import net.mcreator.blahmod.block.ConchShellBlock;
import net.mcreator.blahmod.block.CoconutBlock;
import net.mcreator.blahmod.block.ChiseledDreadSandstoneBlock;
import net.mcreator.blahmod.block.ChiseledBlackSandstoneBlock;
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
