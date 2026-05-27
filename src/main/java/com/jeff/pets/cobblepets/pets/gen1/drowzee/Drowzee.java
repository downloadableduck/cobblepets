package com.jeff.pets.cobblepets.pets.gen1.drowzee;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Drowzee extends GroundCobblemon {
    public Drowzee(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.drowzee.ground_idle";
    }

    @Override
    public String getController() {
        return "drowzee_anim";
    }

    @Override
    public String getWalkAnim() {
        return this.getIdleAnim();
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1f;
    }
}
