package com.jeff.pets.cobblepets.pets.gen1.slowpoke;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Slowpoke extends GroundCobblemon {
    public Slowpoke(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.slowpoke.ground_idle";
    }

    @Override
    public String getController() {
        return "slowpoke_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.slowpoke.ground_walk";
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
