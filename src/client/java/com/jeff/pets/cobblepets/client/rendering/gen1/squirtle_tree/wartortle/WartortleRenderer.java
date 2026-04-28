package com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.wartortle;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Wartortle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class WartortleRenderer extends CobbleRenderer<Wartortle, LivingEntityRenderState> {
    public WartortleRenderer(EntityRendererProvider.Context context) {
        super(context, new WartortleModel());
    }
}
