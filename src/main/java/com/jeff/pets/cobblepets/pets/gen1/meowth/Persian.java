package com.jeff.pets.cobblepets.pets.gen1.meowth;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Persian extends GroundCobblemon {
    public Persian(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "persian_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.persian.ground_idle";
    }

    @Override
    public String getController() {
        return "persian_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.persian.ground_idle";
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
