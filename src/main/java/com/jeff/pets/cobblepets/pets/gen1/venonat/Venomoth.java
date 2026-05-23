package com.jeff.pets.cobblepets.pets.gen1.venonat;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Venomoth extends FlyingCobblemon {
    public Venomoth(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "venomoth_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.venomoth.air_idle";
    }

    @Override
    public String getController() {
        return "venomoth_fly";
    }

    @Override
    public String getFlyAnim() {
        return "animation.venomoth.air_fly";
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
