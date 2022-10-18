
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.blahmod.item.UltimateGauntletItem;
import net.mcreator.blahmod.item.TheToolItem;
import net.mcreator.blahmod.item.TadaniteSwordItem;
import net.mcreator.blahmod.item.TadaniteShovelItem;
import net.mcreator.blahmod.item.TadanitePickaxeItem;
import net.mcreator.blahmod.item.TadaniteItem;
import net.mcreator.blahmod.item.TadaniteHoeItem;
import net.mcreator.blahmod.item.TadaniteDiamondItem;
import net.mcreator.blahmod.item.TadaniteCrystalItem;
import net.mcreator.blahmod.item.TadaniteAxeItem;
import net.mcreator.blahmod.item.SulphurItem;
import net.mcreator.blahmod.item.RubyItem;
import net.mcreator.blahmod.item.ObsidifiedBlazeRodItem;
import net.mcreator.blahmod.item.ObsidianItem;
import net.mcreator.blahmod.item.ObsidianFabricItem;
import net.mcreator.blahmod.item.ObsidianConstructItem;
import net.mcreator.blahmod.item.NetherCoreItem;
import net.mcreator.blahmod.item.MoltenIceItem;
import net.mcreator.blahmod.item.GildedObsidianItem;
import net.mcreator.blahmod.item.FrozenMistBucketItem;
import net.mcreator.blahmod.item.CoconutFoodItem;
import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlahmodMod.MODID);
	public static final RegistryObject<Item> BLACK_SAND = block(BlahmodModBlocks.BLACK_SAND, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_LOG = block(BlahmodModBlocks.TROPICS_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_PLANKS = block(BlahmodModBlocks.TROPICS_PLANKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_LEAVES = block(BlahmodModBlocks.TROPICS_LEAVES, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> BLACK_SANDSTONE = block(BlahmodModBlocks.BLACK_SANDSTONE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> RUBY_ORE = block(BlahmodModBlocks.RUBY_ORE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> TROPICS_SLAB = block(BlahmodModBlocks.TROPICS_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_STAIRS = block(BlahmodModBlocks.TROPICS_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_FENCE = block(BlahmodModBlocks.TROPICS_FENCE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_FENCE_GATE = block(BlahmodModBlocks.TROPICS_FENCE_GATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_WOOD = block(BlahmodModBlocks.TROPICS_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_DOOR = doubleBlock(BlahmodModBlocks.TROPICS_DOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_TRAPDOOR = block(BlahmodModBlocks.TROPICS_TRAPDOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_PRESSURE_PLATE = block(BlahmodModBlocks.TROPICS_PRESSURE_PLATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICS_BUTTON = block(BlahmodModBlocks.TROPICS_BUTTON, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> BLACK_SANDSTONE_SLAB = block(BlahmodModBlocks.BLACK_SANDSTONE_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> THE_TOOL = REGISTRY.register("the_tool", () -> new TheToolItem());
	public static final RegistryObject<Item> ULTIMATE_GAUNTLET = REGISTRY.register("ultimate_gauntlet", () -> new UltimateGauntletItem());
	public static final RegistryObject<Item> RUBY_BLOCK = block(BlahmodModBlocks.RUBY_BLOCK, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_LOG = block(BlahmodModBlocks.DREAD_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_PLANKS = block(BlahmodModBlocks.DREAD_PLANKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_SAND = block(BlahmodModBlocks.DREAD_SAND, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_SANDSTONE = block(BlahmodModBlocks.DREAD_SANDSTONE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CHISELED_BLACK_SANDSTONE = block(BlahmodModBlocks.CHISELED_BLACK_SANDSTONE,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> BLACK_SANDSTONE_STAIRS = block(BlahmodModBlocks.BLACK_SANDSTONE_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CUT_BLACK_SANDSTONE = block(BlahmodModBlocks.CUT_BLACK_SANDSTONE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SMOOTH_BLACK_SANDSTONE = block(BlahmodModBlocks.SMOOTH_BLACK_SANDSTONE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> BLACK_SANDSTONE_WALL = block(BlahmodModBlocks.BLACK_SANDSTONE_WALL, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SMOOTH_BLACK_SANDSTONE_SLAB = block(BlahmodModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SMOOTH_BLACK_SANDSTONE_STAIRS = block(BlahmodModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_SLAB = block(BlahmodModBlocks.DREAD_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> LUSH_BLACK_SAND = block(BlahmodModBlocks.LUSH_BLACK_SAND, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> COCONUT = block(BlahmodModBlocks.COCONUT, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> COCONUT_FOOD = REGISTRY.register("coconut_food", () -> new CoconutFoodItem());
	public static final RegistryObject<Item> SEASHELL = block(BlahmodModBlocks.SEASHELL, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CONCH_SHELL = block(BlahmodModBlocks.CONCH_SHELL, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> REINFORCED_GLASS = block(BlahmodModBlocks.REINFORCED_GLASS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> REINFORCED_GLASS_PANE = block(BlahmodModBlocks.REINFORCED_GLASS_PANE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> HORIZONTAL_REINFORCED_GLASS_PANE = block(BlahmodModBlocks.HORIZONTAL_REINFORCED_GLASS_PANE,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_LOG = block(BlahmodModBlocks.WHITEWOOD_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_PLANKS = block(BlahmodModBlocks.WHITEWOOD_PLANKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_LEAVES = block(BlahmodModBlocks.WHITEWOOD_LEAVES, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_SLAB = block(BlahmodModBlocks.WHITEWOOD_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_STAIRS = block(BlahmodModBlocks.WHITEWOOD_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_FENCE = block(BlahmodModBlocks.WHITEWOOD_FENCE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_FENCE_GATE = block(BlahmodModBlocks.WHITEWOOD_FENCE_GATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_DOOR = doubleBlock(BlahmodModBlocks.WHITEWOOD_DOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_TRAPDOOR = block(BlahmodModBlocks.WHITEWOOD_TRAPDOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_WOOD = block(BlahmodModBlocks.WHITEWOOD_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_WHITEWOOD_LOG = block(BlahmodModBlocks.STRIPPED_WHITEWOOD_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_WHITEWOOD_WOOD = block(BlahmodModBlocks.STRIPPED_WHITEWOOD_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_TROPICS_WOOD = block(BlahmodModBlocks.STRIPPED_TROPICS_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_TROPICS_LOG = block(BlahmodModBlocks.STRIPPED_TROPICS_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_STAIRS = block(BlahmodModBlocks.DREAD_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_FENCE = block(BlahmodModBlocks.DREAD_FENCE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_FENCE_GATE = block(BlahmodModBlocks.DREAD_FENCE_GATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_DOOR = doubleBlock(BlahmodModBlocks.DREAD_DOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_TRAPDOOR = block(BlahmodModBlocks.DREAD_TRAPDOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_SANDSTONE_SLAB = block(BlahmodModBlocks.DREAD_SANDSTONE_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_SANDSTONE_STAIRS = block(BlahmodModBlocks.DREAD_SANDSTONE_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_SANDSTONE_WALL = block(BlahmodModBlocks.DREAD_SANDSTONE_WALL, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CUT_DREAD_SANDSTONE = block(BlahmodModBlocks.CUT_DREAD_SANDSTONE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SMOOTH_DREAD_SANDSTONE = block(BlahmodModBlocks.SMOOTH_DREAD_SANDSTONE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CHISELED_DREAD_SANDSTONE = block(BlahmodModBlocks.CHISELED_DREAD_SANDSTONE,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SMOOTH_DREAD_SANDSTONE_SLAB = block(BlahmodModBlocks.SMOOTH_DREAD_SANDSTONE_SLAB,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SMOOTH_DREAD_SANDSTONE_STAIRS = block(BlahmodModBlocks.SMOOTH_DREAD_SANDSTONE_STAIRS,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_DREAD_WOOD = block(BlahmodModBlocks.STRIPPED_DREAD_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_DREAD_LOG = block(BlahmodModBlocks.STRIPPED_DREAD_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> LOAM = block(BlahmodModBlocks.LOAM, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TROPICAL_GRASS = block(BlahmodModBlocks.TROPICAL_GRASS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> NETHERFROST = block(BlahmodModBlocks.NETHERFROST, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SOUL_SNOW = block(BlahmodModBlocks.SOUL_SNOW, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_WOOD_LOG = block(BlahmodModBlocks.FROST_WOOD_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CORE_WART_BLOCK = block(BlahmodModBlocks.CORE_WART_BLOCK, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CORELIGHT = block(BlahmodModBlocks.CORELIGHT, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CORE_NYLIUM = block(BlahmodModBlocks.CORE_NYLIUM, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> NETHER_ICE = block(BlahmodModBlocks.NETHER_ICE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SULPHUR_ORE_NC = block(BlahmodModBlocks.SULPHUR_ORE_NC, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SULPHUR = REGISTRY.register("sulphur", () -> new SulphurItem());
	public static final RegistryObject<Item> STRIPPED_FROST_WOOD = block(BlahmodModBlocks.STRIPPED_FROST_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_FROST_LOG = block(BlahmodModBlocks.STRIPPED_FROST_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_PLANKS = block(BlahmodModBlocks.FROST_PLANKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_SLAB = block(BlahmodModBlocks.FROST_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_STAIRS = block(BlahmodModBlocks.FROST_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_FENCE = block(BlahmodModBlocks.FROST_FENCE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_FENCE_GATE = block(BlahmodModBlocks.FROST_FENCE_GATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TADANITE_ORE = block(BlahmodModBlocks.TADANITE_ORE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TADANITE_CRYSTAL = REGISTRY.register("tadanite_crystal", () -> new TadaniteCrystalItem());
	public static final RegistryObject<Item> MOLTEN_ICE_BUCKET = REGISTRY.register("molten_ice_bucket", () -> new MoltenIceItem());
	public static final RegistryObject<Item> NETHER_CORE = REGISTRY.register("nether_core", () -> new NetherCoreItem());
	public static final RegistryObject<Item> CORE_FUNGUS = block(BlahmodModBlocks.CORE_FUNGUS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CORE_VINE = block(BlahmodModBlocks.CORE_VINE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> NETHER_CORE_GROVE_AIR = block(BlahmodModBlocks.NETHER_CORE_GROVE_AIR, null);
	public static final RegistryObject<Item> SALT = block(BlahmodModBlocks.SALT, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SALT_DELTAS_AIR = block(BlahmodModBlocks.SALT_DELTAS_AIR, null);
	public static final RegistryObject<Item> PERMA_ICE = block(BlahmodModBlocks.PERMA_ICE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TADANITE_HELMET = REGISTRY.register("tadanite_helmet", () -> new TadaniteItem.Helmet());
	public static final RegistryObject<Item> TADANITE_CHESTPLATE = REGISTRY.register("tadanite_chestplate", () -> new TadaniteItem.Chestplate());
	public static final RegistryObject<Item> TADANITE_LEGGINGS = REGISTRY.register("tadanite_leggings", () -> new TadaniteItem.Leggings());
	public static final RegistryObject<Item> TADANITE_BOOTS = REGISTRY.register("tadanite_boots", () -> new TadaniteItem.Boots());
	public static final RegistryObject<Item> TADANITE_BLOCK = block(BlahmodModBlocks.TADANITE_BLOCK, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> TADANITE_PICKAXE = REGISTRY.register("tadanite_pickaxe", () -> new TadanitePickaxeItem());
	public static final RegistryObject<Item> TADANITE_SWORD = REGISTRY.register("tadanite_sword", () -> new TadaniteSwordItem());
	public static final RegistryObject<Item> TADANITE_AXE = REGISTRY.register("tadanite_axe", () -> new TadaniteAxeItem());
	public static final RegistryObject<Item> TADANITE_SHOVEL = REGISTRY.register("tadanite_shovel", () -> new TadaniteShovelItem());
	public static final RegistryObject<Item> TADANITE_HOE = REGISTRY.register("tadanite_hoe", () -> new TadaniteHoeItem());
	public static final RegistryObject<Item> OBSIDIFIED_BLAZE_ROD = REGISTRY.register("obsidified_blaze_rod", () -> new ObsidifiedBlazeRodItem());
	public static final RegistryObject<Item> TADANITE_DIAMOND = REGISTRY.register("tadanite_diamond", () -> new TadaniteDiamondItem());
	public static final RegistryObject<Item> FROST_HYPHAE = block(BlahmodModBlocks.FROST_HYPHAE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_DOOR = doubleBlock(BlahmodModBlocks.FROST_DOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROST_TRAPDOOR = block(BlahmodModBlocks.FROST_TRAPDOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CACTUS_PLANKS = block(BlahmodModBlocks.CACTUS_PLANKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CACTUS_DOOR = doubleBlock(BlahmodModBlocks.CACTUS_DOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CACTUS_TRAPDOOR = block(BlahmodModBlocks.CACTUS_TRAPDOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_LOG = block(BlahmodModBlocks.CEDAR_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_WOOD = block(BlahmodModBlocks.CEDAR_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_LEAVES = block(BlahmodModBlocks.CEDAR_LEAVES, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_WOOD = block(BlahmodModBlocks.DREAD_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_CEDAR_WOOD = block(BlahmodModBlocks.STRIPPED_CEDAR_WOOD, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> STRIPPED_CEDAR_LOG = block(BlahmodModBlocks.STRIPPED_CEDAR_LOG, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_PLANKS = block(BlahmodModBlocks.CEDAR_PLANKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_SLAB = block(BlahmodModBlocks.CEDAR_SLAB, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_STAIRS = block(BlahmodModBlocks.CEDAR_STAIRS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_FENCE = block(BlahmodModBlocks.CEDAR_FENCE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_PRESSURE_PLATE = block(BlahmodModBlocks.DREAD_PRESSURE_PLATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_BUTTON = block(BlahmodModBlocks.DREAD_BUTTON, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_FENCE_GATE = block(BlahmodModBlocks.CEDAR_FENCE_GATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_PRESSURE_PLATE = block(BlahmodModBlocks.CEDAR_PRESSURE_PLATE, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_BUTTON = block(BlahmodModBlocks.CEDAR_BUTTON, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_DOOR = doubleBlock(BlahmodModBlocks.CEDAR_DOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CEDAR_TRAPDOOR = block(BlahmodModBlocks.CEDAR_TRAPDOOR, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_PRESSURE_PLATE = block(BlahmodModBlocks.WHITEWOOD_PRESSURE_PLATE,
			BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> WHITEWOOD_BUTTON = block(BlahmodModBlocks.WHITEWOOD_BUTTON, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CORE_ROOTS = block(BlahmodModBlocks.CORE_ROOTS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> SCORIA = block(BlahmodModBlocks.SCORIA, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> LIGHTLY_CHARRED_SCORIA = block(BlahmodModBlocks.LIGHTLY_CHARRED_SCORIA, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> CHARRED_SCORIA = block(BlahmodModBlocks.CHARRED_SCORIA, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> FROZEN_MIST_BUCKET = REGISTRY.register("frozen_mist_bucket", () -> new FrozenMistBucketItem());
	public static final RegistryObject<Item> FROZEN_MIST = block(BlahmodModBlocks.FROZEN_MIST, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_ROCK = block(BlahmodModBlocks.DREAD_ROCK, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> DREAD_ROCK_BRICKS = block(BlahmodModBlocks.DREAD_ROCK_BRICKS, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> REINFORCED_CHEST = block(BlahmodModBlocks.REINFORCED_CHEST, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> OBSIDIAN_HELMET = REGISTRY.register("obsidian_helmet", () -> new ObsidianItem.Helmet());
	public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = REGISTRY.register("obsidian_chestplate", () -> new ObsidianItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = REGISTRY.register("obsidian_leggings", () -> new ObsidianItem.Leggings());
	public static final RegistryObject<Item> OBSIDIAN_BOOTS = REGISTRY.register("obsidian_boots", () -> new ObsidianItem.Boots());
	public static final RegistryObject<Item> OBSIDIAN_FABRIC = REGISTRY.register("obsidian_fabric", () -> new ObsidianFabricItem());
	public static final RegistryObject<Item> GILDED_OBSIDIAN_HELMET = REGISTRY.register("gilded_obsidian_helmet",
			() -> new GildedObsidianItem.Helmet());
	public static final RegistryObject<Item> GILDED_OBSIDIAN_CHESTPLATE = REGISTRY.register("gilded_obsidian_chestplate",
			() -> new GildedObsidianItem.Chestplate());
	public static final RegistryObject<Item> GILDED_OBSIDIAN_LEGGINGS = REGISTRY.register("gilded_obsidian_leggings",
			() -> new GildedObsidianItem.Leggings());
	public static final RegistryObject<Item> GILDED_OBSIDIAN_BOOTS = REGISTRY.register("gilded_obsidian_boots", () -> new GildedObsidianItem.Boots());
	public static final RegistryObject<Item> OBSIDIAN_CONSTRUCT = REGISTRY.register("obsidian_construct", () -> new ObsidianConstructItem());
	public static final RegistryObject<Item> BLAZE_BRICK = block(BlahmodModBlocks.BLAZE_BRICK, BlahmodModTabs.TAB_BLOCKS_TAB);
	public static final RegistryObject<Item> BORDERLESS_GLASS = block(BlahmodModBlocks.BORDERLESS_GLASS, BlahmodModTabs.TAB_BLOCKS_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
