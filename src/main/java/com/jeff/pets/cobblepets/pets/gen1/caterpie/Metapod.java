package com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Metapod extends GroundCobblemon {
    public Metapod(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "metapod_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.metapod.ground_idle";
    }

    @Override
    public String getController() {
        return "metapod_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.metapod.ground_idle";
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
