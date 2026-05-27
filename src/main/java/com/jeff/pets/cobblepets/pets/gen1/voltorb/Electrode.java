package com.jeff.pets.cobblepets.pets.gen1.voltorb;

import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Electrode extends GroundCobblemon {
    public Electrode(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.electrode.ground_idle";
    }

    @Override
    public String getController() {
        return "electrode_anim";
    }

    @Override
    public String getWalkAnim() {
        return "animation.electrode.ground_walk";
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
