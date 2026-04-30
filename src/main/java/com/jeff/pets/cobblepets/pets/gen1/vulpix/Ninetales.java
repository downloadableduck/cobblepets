package com.jeff.pets.cobblepets.pets.gen1.vulpix;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Ninetales extends GroundCobblemon {
    public Ninetales(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "ninetales_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.ninetales.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "ninetales_walk";
    }

    @Override
    public String getWalkName() {
        return this.getIdleName();
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
