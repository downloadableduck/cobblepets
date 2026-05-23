package com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Caterpie extends GroundCobblemon {
    public Caterpie(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "caterpie_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.caterpie.ground_idle";
    }

    @Override
    public String getController() {
        return "caterpie_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.caterpie.ground_walk";
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
