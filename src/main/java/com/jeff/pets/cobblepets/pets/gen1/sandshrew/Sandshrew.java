package com.jeff.pets.cobblepets.pets.gen1.sandshrew;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Sandshrew extends GroundCobblemon {
    public Sandshrew(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "sandshrew_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.sandshrew.ground_idle";
    }

    @Override
    public String getController() {
        return "sandshrew_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.sandshrew.ground_walk";
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
