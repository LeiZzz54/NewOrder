
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neworder.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.neworder.NewOrderMod;

public class NewOrderModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewOrderMod.MODID);
	public static final RegistryObject<Item> IMPERIAL_SOLDIER_SPAWN_EGG = REGISTRY.register("imperial_soldier_spawn_egg", () -> new ForgeSpawnEggItem(NewOrderModEntities.IMPERIAL_SOLDIER, -26368, -1, new Item.Properties()));
	public static final RegistryObject<Item> IMPERIAL_ARCHER_SPAWN_EGG = REGISTRY.register("imperial_archer_spawn_egg", () -> new ForgeSpawnEggItem(NewOrderModEntities.IMPERIAL_ARCHER, -26368, -16777216, new Item.Properties()));
}
