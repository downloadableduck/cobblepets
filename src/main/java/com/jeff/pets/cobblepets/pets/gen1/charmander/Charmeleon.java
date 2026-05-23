package com.jeff.pets.cobblepets.pets.gen1.charmander;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Charmeleon extends GroundCobblemon {
    public Charmeleon(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "charmeleon_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.charmeleon.ground_idle";
    }

    @Override
    public String getController() {
        return "charmeleon_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.charmeleon.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 1f;
    }
}
