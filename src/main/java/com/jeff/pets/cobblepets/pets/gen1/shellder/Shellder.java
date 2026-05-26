package com.jeff.pets.cobblepets.pets.gen1.shellder;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Shellder extends GroundCobblemon {
    public Shellder(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.shellder.ground_idle";
    }

    @Override
    public String getController() {
        return "shellder_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.shellder.ground_walk";
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
