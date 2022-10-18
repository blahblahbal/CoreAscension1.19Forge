
package net.mcreator.blahmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.blahmod.procedures.FrozenMistBucketRightClickOnBlockProcedure;
import net.mcreator.blahmod.init.BlahmodModTabs;

public class FrozenMistBucketItem extends Item {
	public FrozenMistBucketItem() {
		super(new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		FrozenMistBucketRightClickOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
