package com.jeff.pets.cobblepets.client.rendering;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.model.GeoModel;
import com.geckolib.renderer.GeoEntityRenderer;
import com.jeff.pets.client.compat.ViaFabricPlusCompat;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public abstract class CobbleRenderer<T extends Entity & GeoAnimatable> extends GeoEntityRenderer<@NotNull T, @NotNull LivingEntityRenderState> {
    public CobbleRenderer(EntityRendererProvider.Context context, GeoModel<@NotNull T> model) {
        super(context, model);
    }

    @Override
    public void extractRenderState(T entity, LivingEntityRenderState state, float f) {
        super.extractRenderState(entity, state, f);
        state.isUpsideDown = entity.getPlainTextName().equals("Grumm") || entity.getPlainTextName().equals("Dinnerbone");
        if (ViaFabricPlusCompat.shouldUpdateThingy() && entity.isPassenger()) {
            state.passengerOffset = new Vec3(state.passengerOffset.x, state.passengerOffset.y + 0.35, state.passengerOffset.z);
        }
    }
}
