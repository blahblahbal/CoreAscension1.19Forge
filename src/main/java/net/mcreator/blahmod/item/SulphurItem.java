
package net.mcreator.blahmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.blahmod.init.BlahmodModTabs;

public class SulphurItem extends Item {
	public SulphurItem() {
		super(new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
