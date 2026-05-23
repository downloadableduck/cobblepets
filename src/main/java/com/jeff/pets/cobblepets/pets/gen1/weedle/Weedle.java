package com.jeff.pets.cobblepets.pets.gen1.weedle;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Weedle extends GroundCobblemon {
    public Weedle(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "weedle_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.weedle.ground_idle";
    }

    @Override
    public String getController() {
        return "weedle_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.weedle.ground_walk";
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
