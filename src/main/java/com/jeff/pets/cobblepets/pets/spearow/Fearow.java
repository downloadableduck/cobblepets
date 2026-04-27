package com.jeff.pets.cobblepets.pets.spearow;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Fearow extends GroundCobblemon {
    public Fearow(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "fearow_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.fearow.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "fearow_fly";
    }

    @Override
    public String getWalkName() {
        return this.getIdleName();
    }

    @Override
    protected int stopDistance() {
        return 5;
    }

    @Override
    protected float heartHeight() {
        return 3;
    }
}
