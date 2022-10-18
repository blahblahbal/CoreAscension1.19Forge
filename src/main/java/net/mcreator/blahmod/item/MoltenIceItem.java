
package net.mcreator.blahmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.blahmod.init.BlahmodModTabs;
import net.mcreator.blahmod.init.BlahmodModFluids;

public class MoltenIceItem extends BucketItem {
	public MoltenIceItem() {
		super(BlahmodModFluids.MOLTEN_ICE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BlahmodModTabs.TAB_ITEMS_TAB));
	}
}
