package com.jeff.pets.cobblepets.pets.gen1.growlith;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Arcanine extends GroundCobblemon {
    public Arcanine(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.arcanine.ground_idle";
    }

    @Override
    public String getController() {
        return "arcanine_idle";
    }

    @Override
    public String getWalkAnim() {
        return "animation.arcanine.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 2;
    }

    @Override
    public boolean isMoving() {
        return this.distanceTo(this.getOwner()) > 2.5;
    }
}
