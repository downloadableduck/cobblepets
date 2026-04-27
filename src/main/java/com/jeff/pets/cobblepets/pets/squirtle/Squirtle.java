package com.jeff.pets.cobblepets.pets.squirtle;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Squirtle extends GroundCobblemon {
    public Squirtle(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "squirtle_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.squirtle.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "squirtle_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.squirtle.ground_walk";
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
