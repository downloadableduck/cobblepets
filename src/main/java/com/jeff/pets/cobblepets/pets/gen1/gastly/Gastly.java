package com.jeff.pets.cobblepets.pets.gen1.gastly;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Gastly extends GroundCobblemon {
    public Gastly(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.gastly.ground_idle";
    }

    @Override
    public String getController() {
        return "gastly_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.gastly.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 0.5f;
    }
}
