package com.jeff.pets.cobblepets.pets.rattata;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Rattata extends GroundCobblemon {
    public Rattata(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "rattata_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.rattata.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "rattata_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.rattata.ground_idle";
    }

    @Override
    protected int stopDistance() {
        return 3;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
