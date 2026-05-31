package com.jeff.pets.cobblepets.pets.gen5.snivy;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Servine extends GroundCobblemon {
    public Servine(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.servine.ground_idle";
    }

    @Override
    public String getController() {
        return "servine_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.servine.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 0.75f;
    }
}
