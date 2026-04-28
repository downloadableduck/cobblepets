package com.jeff.pets.cobblepets.pets.gen1.nidoramf;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Nidoranf extends GroundCobblemon {
    public Nidoranf(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "nidoranf_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.nidoranf.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "nidoranf_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.nidoranf.ground_walk";
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
