package com.jeff.pets.cobblepets.pets.gen1.mew;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Mewtwo extends GroundCobblemon {
    public Mewtwo(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "mewtwo_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.mewtwo_atm.ground_idle";
    }

    @Override
    public String getController() {
        return "mewtwo_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.mewtwo_atm.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 3;
    }
}
