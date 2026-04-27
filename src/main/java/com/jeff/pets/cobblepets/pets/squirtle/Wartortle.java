package com.jeff.pets.cobblepets.pets.squirtle;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Wartortle extends GroundCobblemon {
    public Wartortle(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "wartortle_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.wartortle.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "wartortle_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.wartortle.ground_walk";
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
