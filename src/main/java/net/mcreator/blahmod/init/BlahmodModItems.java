
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
import net.mcreator.blahmod.item.RubyItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
