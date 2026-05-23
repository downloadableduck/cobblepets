package com.jeff.pets.cobblepets.pets.gen1.machop;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Machoke extends GroundCobblemon {
    public Machoke(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.machoke.ground_idle";
    }

    @Override
    public String getController() {
        return "machop_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.machoke.ground_walk";
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
