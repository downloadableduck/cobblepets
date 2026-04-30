package com.jeff.pets.cobblepets.pets.gen1.zubat;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Zubat extends FlyingCobblemon {
    public Zubat(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "zubat_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.zubat.air_idle";
    }

    @Override
    public String getFlyController() {
        return "zubat_fly";
    }

    @Override
    public String getFlyName() {
        return "animation.zubat.air_fly";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1f;
    }
}
