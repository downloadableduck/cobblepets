package com.jeff.pets.cobblepets.pets.spearow;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Spearow extends GroundCobblemon {
    public Spearow(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "spearow_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.spearow.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "spearow_fly";
    }

    @Override
    public String getWalkName() {
        return "animation.spearow.ground_idle";
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
