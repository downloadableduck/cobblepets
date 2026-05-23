package com.jeff.pets.cobblepets.pets;

import com.geckolib.animatable.GeoEntity;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.util.GeckoLibUtil;
import com.jeff.pets.mob.GroundPet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public abstract class GroundCobblemon extends GroundPet implements GeoEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    @Deprecated
    public String getIdleController() {
        return "";
    }
    public abstract String getIdleAnim();
    public abstract String getController();
    public abstract String getWalkAnim();

    public GroundCobblemon(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CHICKEN_STEP.value();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this.getController(), 5, animTest -> {
         if (!this.isMoving()) {
             return animTest.setAndContinue(RawAnimation.begin().thenLoop(this.getIdleAnim()));
         }
         return animTest.setAndContinue(RawAnimation.begin().thenLoop(this.getWalkAnim()));
        }));
    }

    @Override
    public @NotNull AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public boolean isMoving() {
        return this.distanceTo(this.getOwner()) > 1.5;
    }

    @Override
    public float distanceTo(Entity entity) {
        float x = (float)(this.getX() - entity.getX());
        float z = (float)(this.getZ() - entity.getZ());
        return Mth.sqrt(x * x + z * z);
    }
}
