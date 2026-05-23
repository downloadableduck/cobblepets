package com.jeff.pets.cobblepets.pets.gen1.nidoramf;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Nidorina extends GroundCobblemon {
    public Nidorina(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "nidorina_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.nidorina.idle";
    }

    @Override
    public String getController() {
        return "nidorina_walk";
    }

    @Override
    public String getWalkAnim() {
        return this.getIdleAnim();
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
