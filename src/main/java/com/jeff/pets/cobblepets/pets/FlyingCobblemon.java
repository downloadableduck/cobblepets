package com.jeff.pets.cobblepets.pets;

import com.geckolib.animatable.GeoEntity;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.animation.object.PlayState;
import com.geckolib.util.GeckoLibUtil;
import com.jeff.pets.mob.FlyingPet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public abstract class FlyingCobblemon extends FlyingPet implements GeoEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public abstract String getIdleController();
    public abstract String getIdleName();
    public abstract String getFlyController();
    public abstract String getFlyName();

    public FlyingCobblemon(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CHICKEN_STEP.value();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this.getIdleController(), 20, animTest -> {
         if (animTest.isMoving()) {
             return animTest.setAndContinue(RawAnimation.begin().thenLoop(this.getIdleName()));
         } else {
             return PlayState.STOP;
         }
        }));
        controllers.add(new AnimationController<>(this.getFlyController(), 20, s -> {
            if (!s.isMoving()) {
                return s.setAndContinue(RawAnimation.begin().thenLoop(this.getFlyName()));
            } else {
                return PlayState.STOP;
            }
        }));
    }

    @Override
    public @NotNull AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void tick() {
        super.tick();
        triggerAnim(this.getFlyController(), this.getFlyName());
        triggerAnim(this.getIdleController(), this.getIdleName());
    }
}
