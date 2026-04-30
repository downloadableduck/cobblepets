package com.jeff.pets.cobblepets.client.rendering.gen1.jigglypuff_tree.wigglytuff;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.jigglypuff.Wigglytuff;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class WigglytuffRenderer extends CobbleRenderer<Wigglytuff> {
    public WigglytuffRenderer(EntityRendererProvider.Context context) {
        super(context, new WigglytuffModel());
    }
}
