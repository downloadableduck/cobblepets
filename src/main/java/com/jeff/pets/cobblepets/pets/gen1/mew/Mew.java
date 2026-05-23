package com.jeff.pets.cobblepets.pets.gen1.mew;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Mew extends GroundCobblemon {
    public Mew(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "mew_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.mew.ground_idle";
    }

    @Override
    public String getController() {
        return "mew_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.mew.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
