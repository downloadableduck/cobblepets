package com.jeff.pets.cobblepets.pets.gen1.zubat;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Golbat extends FlyingCobblemon {
    public Golbat(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "golbat_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.golbat.air_idle";
    }

    @Override
    public String getController() {
        return "golbat_fly";
    }

    @Override
    public String getFlyAnim() {
        return "animation.golbat.air_fly";
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
