package com.jeff.pets.cobblepets.pets.gen1.bulbasaur;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Ivysaur extends GroundCobblemon {
    public Ivysaur(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 1;
    }

    @Override
    public String getIdleController() {
        return "ivysaur_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.ivysaur.ground_idle";
    }

    @Override
    public String getController() {
        return "ivysaur_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.ivysaur.ground_walk";
    }
}
