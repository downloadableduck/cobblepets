package com.jeff.pets.cobblepets.pets.charmander;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Charizard extends FlyingCobblemon {
    public Charizard(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "charizard_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.charizard.air_idle";
    }

    @Override
    public String getFlyController() {
        return "charizard_fly";
    }

    @Override
    public String getFlyName() {
        return "animation.charizard.air_fly";
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 2;
    }
}
