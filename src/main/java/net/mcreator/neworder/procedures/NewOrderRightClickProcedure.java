package net.mcreator.neworder.procedures;

import net.minecraft.world.item.*;
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
                if (entity instanceof LivingEntity _living && sourceentity instanceof LivingEntity _living2) {
                    if (armorItem.getType() == ArmorItem.Type.CHESTPLATE) {
                        ItemStack[] suit = getArmorSuit(armorItem.getMaterial());
                        _living.setItemSlot(EquipmentSlot.FEET, suit[0]);
                        _living.setItemSlot(EquipmentSlot.LEGS, suit[1]);
                        _living.setItemSlot(EquipmentSlot.CHEST, _living2.getMainHandItem());
                        _living.setItemSlot(EquipmentSlot.HEAD, suit[2]);
                    }
                    if (armorItem.getType() == ArmorItem.Type.BOOTS)
                        _living.setItemSlot(EquipmentSlot.FEET, _living2.getMainHandItem());
                    if (armorItem.getType() == ArmorItem.Type.LEGGINGS)
                        _living.setItemSlot(EquipmentSlot.LEGS, _living2.getMainHandItem());
                    if (armorItem.getType() == ArmorItem.Type.HELMET)
                        _living.setItemSlot(EquipmentSlot.HEAD, _living2.getMainHandItem());
                }
            }
        }
    }

    private static ItemStack[] getArmorSuit(ArmorMaterial material) {
        if (material == ArmorMaterials.LEATHER) {
            return new ItemStack[]{
                    new ItemStack(Items.LEATHER_BOOTS),
                    new ItemStack(Items.LEATHER_LEGGINGS),
                    new ItemStack(Items.LEATHER_HELMET)
            };
        } else if (material == ArmorMaterials.CHAIN) {
            return new ItemStack[]{
                    new ItemStack(Items.CHAINMAIL_BOOTS),
                    new ItemStack(Items.CHAINMAIL_LEGGINGS),
                    new ItemStack(Items.CHAINMAIL_HELMET)
            };
        } else if (material == ArmorMaterials.IRON) {
            return new ItemStack[]{
                    new ItemStack(Items.IRON_BOOTS),
                    new ItemStack(Items.IRON_LEGGINGS),
                    new ItemStack(Items.IRON_HELMET)
            };
        } else if (material == ArmorMaterials.GOLD) {
            return new ItemStack[]{
                    new ItemStack(Items.GOLDEN_BOOTS),
                    new ItemStack(Items.GOLDEN_LEGGINGS),
                    new ItemStack(Items.GOLDEN_HELMET)
            };
        } else if (material == ArmorMaterials.DIAMOND) {
            return new ItemStack[]{
                    new ItemStack(Items.DIAMOND_BOOTS),
                    new ItemStack(Items.DIAMOND_LEGGINGS),
                    new ItemStack(Items.DIAMOND_HELMET)
            };
        } else if (material == ArmorMaterials.NETHERITE) {
            return new ItemStack[]{
                    new ItemStack(Items.NETHERITE_BOOTS),
                    new ItemStack(Items.NETHERITE_LEGGINGS),
                    new ItemStack(Items.NETHERITE_HELMET)
            };
        }

        return new ItemStack[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};
    }

}
