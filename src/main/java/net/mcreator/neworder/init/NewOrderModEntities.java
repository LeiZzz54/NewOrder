
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

import net.mcreator.neworder.entity.empire.EmpireSoldierEntity;
import net.mcreator.neworder.entity.empire.EmpireArcherEntity;
import net.mcreator.neworder.NewOrderMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewOrderModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NewOrderMod.MODID);
	public static final RegistryObject<EntityType<EmpireSoldierEntity>> EMPIRE_SOLDIER = register("empire_soldier",
			EntityType.Builder.<EmpireSoldierEntity>of(EmpireSoldierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmpireSoldierEntity::new)
					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EmpireArcherEntity>> EMPIRE_ARCHER = register("empire_archer",
			EntityType.Builder.<EmpireArcherEntity>of(EmpireArcherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmpireArcherEntity::new)
					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EmpireSoldierEntity.init();
			EmpireArcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EMPIRE_SOLDIER.get(), EmpireSoldierEntity.createAttributes().build());
		event.put(EMPIRE_ARCHER.get(), EmpireArcherEntity.createAttributes().build());
	}
}
