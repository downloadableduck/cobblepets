package com.jeff.pets.cobblepets.pets.gen1.meowth;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Meowth extends GroundCobblemon {
    public Meowth(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "meowth_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.meowth.ground_idle";
    }

    @Override
    public String getController() {
        return "meowth_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.meowth.ground_walk";
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
