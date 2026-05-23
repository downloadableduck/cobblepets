package com.jeff.pets.cobblepets.pets.gen1.nidoranm;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoranf;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Nidoranm extends GroundCobblemon {

    public Nidoranm(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "nidoranm_idle";
    }

    @Override
    public String getIdleAnim() {
        return "";
    }

    @Override
    public String getController() {
        return "nidoranm_walk";
    }

    @Override
    public String getWalkAnim() {
        return "";
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
