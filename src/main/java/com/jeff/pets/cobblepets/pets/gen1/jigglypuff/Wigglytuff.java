package com.jeff.pets.cobblepets.pets.gen1.jigglypuff;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Wigglytuff extends GroundCobblemon {
    public Wigglytuff(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "wigglytuff_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.wigglytuff.ground_idle";
    }

    @Override
    public String getController() {
        return "wigglytuff_walk";
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
        return 1.25f;
    }
}
