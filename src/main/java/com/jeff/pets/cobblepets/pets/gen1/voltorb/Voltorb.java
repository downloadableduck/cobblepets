package com.jeff.pets.cobblepets.pets.gen1.voltorb;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Voltorb extends GroundCobblemon {
    public Voltorb(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.voltorb.ground_idle";
    }

    @Override
    public String getController() {
        return "voltorb_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.voltorb.ground_walk";
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
