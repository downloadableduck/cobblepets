package com.jeff.pets.cobblepets.pets.gen1.clefairy;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Clefairy extends GroundCobblemon {
    public Clefairy(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "crefairy_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.clefairy.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "clefairy_walk";
    }

    @Override
    public String getWalkName() {
        return this.getIdleName();
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
