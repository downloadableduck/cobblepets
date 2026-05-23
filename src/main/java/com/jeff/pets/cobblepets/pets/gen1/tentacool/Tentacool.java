package com.jeff.pets.cobblepets.pets.gen1.tentacool;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Tentacool extends FlyingCobblemon {
    public Tentacool(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.tentacool.water_idle";
    }

    @Override
    public String getController() {
        return "tentacool_anim";
    }

    @Override
    public String getFlyAnim() {
        return "animation.tentacool.water_swim";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
