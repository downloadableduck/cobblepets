package com.jeff.pets.cobblepets.pets.gen1.nidoranm;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidorina;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Nidorino extends GroundCobblemon {
    @Override
    public String getIdleController() {
        return "nidorino_idle";
    }

    @Override
    public String getIdleName() {
        return "";
    }

    @Override
    public String getWalkController() {
        return "nidorino_walk";
    }

    @Override
    public String getWalkName() {
        return "";
    }

    public Nidorino(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
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
