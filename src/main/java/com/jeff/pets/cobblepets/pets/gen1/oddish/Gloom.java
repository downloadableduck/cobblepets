package com.jeff.pets.cobblepets.pets.gen1.oddish;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Gloom extends GroundCobblemon {
    public Gloom(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleController() {
        return "gloom_idle";
    }

    @Override
    public String getIdleName() {
        return "animation.gloom.ground_idle";
    }

    @Override
    public String getWalkController() {
        return "gloom_walk";
    }

    @Override
    public String getWalkName() {
        return "animation.gloom.ground_walk";
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
