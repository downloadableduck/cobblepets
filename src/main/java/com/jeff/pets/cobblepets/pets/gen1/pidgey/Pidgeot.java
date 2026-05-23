package com.jeff.pets.cobblepets.pets.gen1.pidgey;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Pidgeot extends GroundCobblemon {
    public Pidgeot(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "pidgeot_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.pidgeot.ground_idle";
    }

    @Override
    public String getController() {
        return "pidgeot_fly";
    }

    @Override
    public String getWalkAnim() {
        return "animation.pidgeot.ground_idle";
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
