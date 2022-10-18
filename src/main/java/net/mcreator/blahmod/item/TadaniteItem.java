
package net.mcreator.blahmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.blahmod.procedures.TadaniteArmorTickProcedure;
import net.mcreator.blahmod.init.BlahmodModTabs;
import net.mcreator.blahmod.init.BlahmodModItems;
import net.minecraft.world.entity.LivingEntity;

public abstract class TadaniteItem extends ArmorItem {
	public TadaniteItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 11, 10, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BlahmodModItems.TADANITE_CRYSTAL.get()));
			}

			@Override
			public String getName() {
				return "tadanite";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.12f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TadaniteItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}
				
		public boolean makesPiglinsNeutral(LivingEntity wearer)
   		{
        	return true;
   		}
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/tadanite____layer_1.png";
		}
	}

	public static class Chestplate extends TadaniteItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/tadanite____layer_1.png";
		}

		public boolean makesPiglinsNeutral(LivingEntity wearer)
   		{
        	return true;
   		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			TadaniteArmorTickProcedure.execute(entity);
		}
	}

	public static class Leggings extends TadaniteItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}
		public boolean makesPiglinsNeutral(LivingEntity wearer)
   		{
        	return true;
   		}
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/tadanite____layer_2.png";
		}
	}

	public static class Boots extends TadaniteItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}
		public boolean makesPiglinsNeutral(LivingEntity wearer)
   		{
        	return true;
   		}
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/tadanite____layer_1.png";
		}
	}
}
