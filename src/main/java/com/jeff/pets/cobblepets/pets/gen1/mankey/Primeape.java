package com.jeff.pets.cobblepets.pets.gen1.mankey;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Primeape extends GroundCobblemon {
    public Primeape(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.primeape.ground_idle";
    }

    @Override
    public String getController() {
        return "primeape_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.primeape.ground_walk";
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
