package com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.squirtle;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Squirtle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class SquirtleRenderer extends CobbleRenderer<Squirtle> {
    public SquirtleRenderer(EntityRendererProvider.Context context) {
        super(context, new SquirtleModel());
    }
}
