package com.jeff.pets.cobblepets.pets.gen1.nidoramf;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Nidoqueen extends GroundCobblemon {
    public Nidoqueen(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "nidoqueen_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.nidoqueen.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "nidoqueen_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.nidoqueen.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1;
    }
}
