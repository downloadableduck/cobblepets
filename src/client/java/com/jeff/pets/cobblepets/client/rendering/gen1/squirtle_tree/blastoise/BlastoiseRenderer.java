package com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.blastoise;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Blastoise;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class BlastoiseRenderer extends CobbleRenderer<Blastoise> {
    public BlastoiseRenderer(EntityRendererProvider.Context context) {
        super(context, new BlastoiseModel());
    }
}
