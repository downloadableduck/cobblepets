package com.jeff.pets.cobblepets.pets.gen1.spearow;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Fearow extends GroundCobblemon {
    public Fearow(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "fearow_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.fearow.ground_idle";
    }

    @Override
    public String getController() {
        return "fearow_fly";
    }

    @Override
    public String getWalkAnim() {
        return this.getIdleAnim();
    }

    @Override
    protected int stopDistance() {
        return 5;
    }

    @Override
    protected float heartHeight() {
        return 3;
    }
}
