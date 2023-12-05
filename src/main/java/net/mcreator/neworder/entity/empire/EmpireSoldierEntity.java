
package net.mcreator.neworder.entity.empire;

import net.minecraftforge.network.PlayMessages;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;

import net.mcreator.neworder.init.NewOrderModEntities;

public class EmpireSoldierEntity extends EmpireEntity {
	public EmpireSoldierEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(NewOrderModEntities.EMPIRE_SOLDIER.get(), world);
	}

	public EmpireSoldierEntity(EntityType<EmpireSoldierEntity> type, Level world) {
		super(type, world);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.BOW));
	}
}
