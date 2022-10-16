
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BlahmodModTabs {
	public static CreativeModeTab TAB_BLOCKS_TAB;
	public static CreativeModeTab TAB_ITEMS_TAB;

	public static void load() {
		TAB_BLOCKS_TAB = new CreativeModeTab("tabblocks_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BlahmodModBlocks.TROPICS_PLANKS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ITEMS_TAB = new CreativeModeTab("tabitems_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BlahmodModItems.RUBY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
