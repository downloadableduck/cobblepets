package com.jeff.pets.cobblepets.pets;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.animatable.GeoEntity;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.animation.object.PlayState;
import com.geckolib.util.GeckoLibUtil;
import com.jeff.pets.mob.GroundPet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class GroundCobblemon extends GroundPet implements GeoEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public abstract String getIdleController();
    public abstract String getIdleName();
    public abstract String getWalkController();
    public abstract String getWalkName();

    public GroundCobblemon(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
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
        controllers.add(new AnimationController<>(this.getWalkController(), 20, s -> {
            if (!s.isMoving()) {
                return s.setAndContinue(RawAnimation.begin().thenLoop(this.getWalkName()));
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
        triggerAnim(this.getWalkController(), this.getWalkName());
        triggerAnim(this.getIdleController(), this.getIdleName());
    }
}
