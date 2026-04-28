package com.jeff.pets.cobblepets.client.rendering.gen1.weedle_tree.weedle;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Weedle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class WeedleRenderer extends CobbleRenderer<Weedle, LivingEntityRenderState> {
    public WeedleRenderer(EntityRendererProvider.Context context) {
        super(context, new WeedleModel());
    }
}
