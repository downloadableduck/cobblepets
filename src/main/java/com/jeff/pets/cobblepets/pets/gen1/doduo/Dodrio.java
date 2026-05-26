package com.jeff.pets.cobblepets.pets.gen1.doduo;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Dodrio extends GroundCobblemon {
    public Dodrio(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.dodrio.ground_idle";
    }

    @Override
    public String getController() {
        return "dodrio_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.dodrio.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 2.5f;
    }
}
