package com.jeff.pets.cobblepets.pets.gen1.seel;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Dewgong extends GroundCobblemon {
    public Dewgong(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.dewgong.ground_idle";
    }

    @Override
    public String getController() {
        return "dewgong_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.dewgong.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 0.5f;
    }
}
