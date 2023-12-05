
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
	public static final RegistryObject<Item> EMPIRE_SOLDIER_SPAWN_EGG = REGISTRY.register("empire_soldier_spawn_egg", () -> new ForgeSpawnEggItem(NewOrderModEntities.EMPIRE_SOLDIER, -26368, -1, new Item.Properties()));
	public static final RegistryObject<Item> EMPIRE_ARCHER_SPAWN_EGG = REGISTRY.register("empire_archer_spawn_egg", () -> new ForgeSpawnEggItem(NewOrderModEntities.EMPIRE_ARCHER, -26368, -16777216, new Item.Properties()));
}
