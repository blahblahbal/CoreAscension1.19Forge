
package net.mcreator.blahmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.blahmod.init.BlahmodModTabs;

import java.util.List;

public class UltimateGauntletItem extends Item {
	public UltimateGauntletItem() {
		super(new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77Makes The Tool\u2122 break blocks like a Hammer"));
		list.add(Component.literal("\u00A77Carry this in your inventory to provide the effect"));
	}
}
