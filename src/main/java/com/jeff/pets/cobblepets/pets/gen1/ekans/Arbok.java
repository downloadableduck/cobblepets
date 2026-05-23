package com.jeff.pets.cobblepets.pets.gen1.ekans;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Arbok extends GroundCobblemon {
    public Arbok(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "arbok_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.arbok.ground_idle";
    }

    @Override
    public String getController() {
        return "arbok_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.arbok.ground_walk";
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
