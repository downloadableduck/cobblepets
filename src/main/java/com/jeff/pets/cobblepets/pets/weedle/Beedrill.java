package com.jeff.pets.cobblepets.pets.weedle;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Beedrill extends FlyingCobblemon {
    public Beedrill(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "beedrill_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.beedrill.air_idle";
    }

    @Override
    public String getFlyController() {
        return "beedrill_fly";
    }

    @Override
    public String getFlyName() {
        return "animation.beedrill.air_fly";
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
