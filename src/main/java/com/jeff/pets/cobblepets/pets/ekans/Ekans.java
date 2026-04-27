package com.jeff.pets.cobblepets.pets.ekans;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Ekans extends GroundCobblemon {
    public Ekans(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "ekans_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.ekans.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "ekans_walk";
    }

    @Override
    public String getWalkName() {
        return this.getIdleName();
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 0.5f;
    }
}
