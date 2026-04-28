package com.jeff.pets.cobblepets.pets.gen1.ditto;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Ditto extends GroundCobblemon {
    public Ditto(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "ditto_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.ditto.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "ditto_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.ditto.ground_walk";
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
