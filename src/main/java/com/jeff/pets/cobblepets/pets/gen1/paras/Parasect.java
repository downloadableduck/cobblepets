package com.jeff.pets.cobblepets.pets.gen1.paras;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Parasect extends GroundCobblemon {
    public Parasect(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "parasect_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.parasect.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "parasect_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.parasect.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 1;
    }
}
