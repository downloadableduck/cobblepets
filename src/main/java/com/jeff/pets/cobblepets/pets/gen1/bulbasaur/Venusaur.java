package com.jeff.pets.cobblepets.pets.gen1.bulbasaur;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Venusaur extends GroundCobblemon {
    public Venusaur(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "venusaur_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.venusaur.ground_idle";
    }

    @Override
    public String getController() {
        return "venusaur_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.venusaur.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 5;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
