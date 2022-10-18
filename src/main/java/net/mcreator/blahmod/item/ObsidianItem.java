
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

import net.mcreator.blahmod.procedures.ObsidianArmorProcedure;
import net.mcreator.blahmod.init.BlahmodModTabs;
import net.mcreator.blahmod.init.BlahmodModItems;

public abstract class ObsidianItem extends ArmorItem {
	public ObsidianItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BlahmodModItems.OBSIDIAN_FABRIC.get()));
			}

			@Override
			public String getName() {
				return "obsidian";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ObsidianItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/obsidian___layer_1.png";
		}
	}

	public static class Chestplate extends ObsidianItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/obsidian___layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ObsidianArmorProcedure.execute(entity);
		}
	}

	public static class Leggings extends ObsidianItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/obsidian___layer_2.png";
		}
	}

	public static class Boots extends ObsidianItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(BlahmodModTabs.TAB_ITEMS_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "blahmod:textures/models/armor/obsidian___layer_1.png";
		}
	}
}