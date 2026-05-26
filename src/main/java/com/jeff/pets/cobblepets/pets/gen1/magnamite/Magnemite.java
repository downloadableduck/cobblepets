package com.jeff.pets.cobblepets.pets.gen1.magnamite;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Magnemite extends FlyingCobblemon {
    public Magnemite(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.magnemite.air_idle";
    }

    @Override
    public String getController() {
        return "magmemite_anim";
    }

    @Override
    public String getFlyAnim() {
        return "animation.magnemite.air_fly";
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
