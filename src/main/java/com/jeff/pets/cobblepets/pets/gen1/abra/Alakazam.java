package com.jeff.pets.cobblepets.pets.gen1.abra;

import com.jeff.pets.cobblepets.pets.FlyingCobblemon;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Alakazam extends GroundCobblemon {
    public Alakazam(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public String getIdleAnim() {
        return "animation.alakazam.ground_idle";
    }

    @Override
    public String getController() {
        return "alakazam_idle";
    }

    @Override
    public String getWalkAnim() {
        return "animation.alakazam.ground_walk";
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
