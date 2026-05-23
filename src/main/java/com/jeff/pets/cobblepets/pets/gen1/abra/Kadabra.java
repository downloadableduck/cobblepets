package com.jeff.pets.cobblepets.pets.gen1.abra;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Kadabra extends GroundCobblemon {
    public Kadabra(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.kadabra.ground_idle";
    }

    @Override
    public String getController() {
        return "kadabra_idle";
    }

    @Override
    public String getWalkAnim() {
        return "animation.kadabra.ground_walk";
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
