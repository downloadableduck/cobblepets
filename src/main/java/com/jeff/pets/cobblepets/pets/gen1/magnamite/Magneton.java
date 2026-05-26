package com.jeff.pets.cobblepets.pets.gen1.magnamite;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Magneton extends FlyingCobblemon {
    public Magneton(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.magneton.air_idle";
    }

    @Override
    public String getController() {
        return "magneton_anim";
    }

    @Override
    public String getFlyAnim() {
        return "animation.magneton.air_fly";
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
