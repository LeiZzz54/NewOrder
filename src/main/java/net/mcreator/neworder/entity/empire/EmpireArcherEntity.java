
package net.mcreator.neworder.entity.empire;

import net.minecraftforge.network.PlayMessages;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.mcreator.neworder.init.NewOrderModEntities;

public class EmpireArcherEntity extends EmpireEntity {
	public EmpireArcherEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(NewOrderModEntities.EMPIRE_ARCHER.get(), world);
	}

	public EmpireArcherEntity(EntityType<EmpireArcherEntity> type, Level world) {
		super(type, world);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
	}
}
