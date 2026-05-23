package com.jeff.pets.cobblepets.pets.gen1.growlith;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Growlith extends GroundCobblemon {
    public Growlith(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.growlithe.ground_idle";
    }

    @Override
    public String getController() {
        return "growlithe_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.growlithe.ground_walk";
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
