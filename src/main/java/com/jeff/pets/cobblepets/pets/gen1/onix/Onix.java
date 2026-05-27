package com.jeff.pets.cobblepets.pets.gen1.onix;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Onix extends GroundCobblemon {
    public Onix(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.onix.ground_idle";
    }

    @Override
    public String getController() {
        return "onix_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.onix.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 4f;
    }
}
