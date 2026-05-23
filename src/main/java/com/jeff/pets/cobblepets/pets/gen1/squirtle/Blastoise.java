package com.jeff.pets.cobblepets.pets.gen1.squirtle;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Blastoise extends GroundCobblemon {
    public Blastoise(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "blastoise_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.blastoise.ground_idle";
    }

    @Override
    public String getController() {
        return "blastoise_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.blastoise.ground_walk";
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 2;
    }
}
