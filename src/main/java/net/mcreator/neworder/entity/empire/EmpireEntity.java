package net.mcreator.neworder.entity.empire;

import net.mcreator.neworder.entity.TemplateEntity;
import net.mcreator.neworder.enums.Camp;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EmpireEntity extends TemplateEntity {
    public EmpireEntity(EntityType<? extends EmpireEntity> type, Level world) {
        super(type, world, Camp.EMPIRE);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
