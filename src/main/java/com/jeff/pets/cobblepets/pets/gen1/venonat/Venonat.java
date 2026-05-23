package com.jeff.pets.cobblepets.pets.gen1.venonat;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Venonat extends GroundCobblemon {
    public Venonat(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "venonat_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.venonat.ground_idle";
    }

    @Override
    public String getController() {
        return "venonat_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.venonat.ground_walk";
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
