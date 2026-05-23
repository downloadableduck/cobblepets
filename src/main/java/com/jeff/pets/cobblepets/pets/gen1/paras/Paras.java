package com.jeff.pets.cobblepets.pets.gen1.paras;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Paras extends GroundCobblemon {
    public Paras(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "paras_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.paras.ground_idle";
    }

    @Override
    public String getController() {
        return "paras_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.paras.ground_walk";
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
