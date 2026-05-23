package com.jeff.pets.cobblepets.pets.gen1.nidoranm;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoqueen;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Nidoking extends GroundCobblemon {
    @Override
    public String getIdleController() {
        return "nidoking_idle";
    }

    @Override
    public String getIdleAnim() {
        return "animation.nidoking.ground_idle";
    }

    @Override
    public String getController() {
        return "nidoking_walk";
    }

    @Override
    public String getWalkAnim() {
        return "animation.nidoking.ground_walk";
    }

    public Nidoking(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
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
