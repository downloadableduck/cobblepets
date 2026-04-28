package com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Butterfree extends FlyingCobblemon {
    public Butterfree(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "butterfree_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.butterfree.air_idle";
    }

    @Override
    public String getFlyController() {
        return "butterfree_fly";
    }

    @Override
    public String getFlyName() {
        return "animation.butterfree.air_fly";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1;
    }
}
