package net.mcreator.neworder.procedures;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class NewOrderRightClickProcedure {
    public static void execute(Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null)
            return;
        Item item = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem();
        if (item instanceof ArmorItem) {
            {
                ArmorItem armorItem = (ArmorItem) item;
                if (entity instanceof LivingEntity _living) {
                    if (armorItem.getType() == ArmorItem.Type.BOOTS)
                        _living.setItemSlot(EquipmentSlot.FEET, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                    if (armorItem.getType() == ArmorItem.Type.LEGGINGS)
                        _living.setItemSlot(EquipmentSlot.LEGS, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                    if (armorItem.getType() == ArmorItem.Type.CHESTPLATE)
                        _living.setItemSlot(EquipmentSlot.CHEST, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                    if (armorItem.getType() == ArmorItem.Type.HELMET)
                        _living.setItemSlot(EquipmentSlot.HEAD, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
            }
        }
    }
}
