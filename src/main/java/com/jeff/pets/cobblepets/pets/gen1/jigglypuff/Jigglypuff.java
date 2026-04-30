package com.jeff.pets.cobblepets.pets.gen1.jigglypuff;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Jigglypuff extends GroundCobblemon {
    public Jigglypuff(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "jigglypuff_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.jigglypuff.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "jigglypuff_walk";
    }

    @Override
    public String getWalkName() {
        return this.getIdleName();
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
