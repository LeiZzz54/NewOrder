
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neworder.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.neworder.entity.imperial.ImperialSoldierEntity;
import net.mcreator.neworder.entity.imperial.ImperialArcherEntity;
import net.mcreator.neworder.entity.ImperialSoldierEntity;
import net.mcreator.neworder.NewOrderMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewOrderModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NewOrderMod.MODID);
	public static final RegistryObject<EntityType<ImperialSoldierEntity>> IMPERIAL_SOLDIER = register("imperial_soldier",
			EntityType.Builder.<ImperialSoldierEntity>of(ImperialSoldierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImperialSoldierEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ImperialArcherEntity>> IMPERIAL_ARCHER = register("imperial_archer",
			EntityType.Builder.<ImperialArcherEntity>of(ImperialArcherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImperialArcherEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ImperialSoldierEntity.init();
			ImperialArcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(IMPERIAL_SOLDIER.get(), ImperialSoldierEntity.createAttributes().build());
		event.put(IMPERIAL_ARCHER.get(), ImperialArcherEntity.createAttributes().build());
	}
}
