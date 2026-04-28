package com.jeff.pets.cobblepets.pets.gen1.charmander;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Charmander extends GroundCobblemon {
    public Charmander(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "charmander_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.charmander.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "charmander_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.charmander.ground_walk";
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
