
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.blahmod.world.inventory.ReinChestGUIMenu;
import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BlahmodMod.MODID);
	public static final RegistryObject<MenuType<ReinChestGUIMenu>> REIN_CHEST_GUI = REGISTRY.register("rein_chest_gui",
			() -> IForgeMenuType.create(ReinChestGUIMenu::new));
}
