
package net.mcreator.blahmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.blahmod.init.BlahmodModTabs;
import net.mcreator.blahmod.init.BlahmodModItems;

public class TadaniteSwordItem extends SwordItem {
	public TadaniteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BlahmodModItems.TADANITE_CRYSTAL.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB).fireResistant());
	}
}
