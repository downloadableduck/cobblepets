package com.jeff.pets.cobblepets.pets.gen1.oddish;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Vileplume extends GroundCobblemon {
    public Vileplume(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "vileplume_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.vileplume.idle";
    }

    @Override
    public String getController() {
        return "vileplume_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.vileplume.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
