package com.jeff.pets.cobblepets.pets.gen1.doduo;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Doduo extends GroundCobblemon {
    public Doduo(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.doduo.ground_idle";
    }

    @Override
    public String getController() {
        return "doduo_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.doduo.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1f;
    }
}
