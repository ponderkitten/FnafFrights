
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnaffrights.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.fnaffrights.world.inventory.MemoryMenu;
import net.mcreator.fnaffrights.FnafFrightsMod;

public class FnafFrightsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FnafFrightsMod.MODID);
	public static final RegistryObject<MenuType<MemoryMenu>> MEMORY = REGISTRY.register("memory", () -> IForgeMenuType.create(MemoryMenu::new));
}
