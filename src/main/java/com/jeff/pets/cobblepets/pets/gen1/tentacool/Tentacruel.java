package com.jeff.pets.cobblepets.pets.gen1.tentacool;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Tentacruel extends FlyingCobblemon {
    public Tentacruel(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.tentacruel.water_idle";
    }

    @Override
    public String getController() {
        return "tentacruel_anim";
    }

    @Override
    public String getFlyAnim() {
        return "animation.tentacruel.water_swim";
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 2.5f;
    }
}
