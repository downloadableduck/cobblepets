package com.jeff.pets.cobblepets.client.rendering.squirtle_tree.blastoise;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.squirtle.Blastoise;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class BlastoiseRenderer extends CobbleRenderer<Blastoise, LivingEntityRenderState> {
    public BlastoiseRenderer(EntityRendererProvider.Context context) {
        super(context, new BlastoiseModel());
    }
}
