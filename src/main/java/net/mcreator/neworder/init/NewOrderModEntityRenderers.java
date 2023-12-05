
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neworder.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.neworder.client.renderer.ImperialSoldierRenderer;
import net.mcreator.neworder.client.renderer.ImperialArcherRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewOrderModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NewOrderModEntities.IMPERIAL_SOLDIER.get(), ImperialSoldierRenderer::new);
		event.registerEntityRenderer(NewOrderModEntities.IMPERIAL_ARCHER.get(), ImperialArcherRenderer::new);
	}
}
