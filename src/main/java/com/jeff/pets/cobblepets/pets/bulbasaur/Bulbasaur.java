package com.jeff.pets.cobblepets.pets.bulbasaur;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Bulbasaur extends GroundCobblemon {
    public Bulbasaur(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "bulbasaur_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.bulbasaur.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "bulbasaur_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.bulbasaur.ground_walk";
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
