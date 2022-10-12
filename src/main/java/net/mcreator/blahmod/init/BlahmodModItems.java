
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlahmodMod.MODID);
	public static final RegistryObject<Item> BLACK_SAND = block(BlahmodModBlocks.BLACK_SAND, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TROPICS_LOG = block(BlahmodModBlocks.TROPICS_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TROPICS_PLANKS = block(BlahmodModBlocks.TROPICS_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TROPICS_LEAVES = block(BlahmodModBlocks.TROPICS_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLACK_SANDSTONE = block(BlahmodModBlocks.BLACK_SANDSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
