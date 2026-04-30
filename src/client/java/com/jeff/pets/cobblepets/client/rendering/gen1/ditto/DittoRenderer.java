package com.jeff.pets.cobblepets.client.rendering.gen1.ditto;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.ditto.Ditto;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class DittoRenderer extends CobbleRenderer<Ditto> {
    public DittoRenderer(EntityRendererProvider.Context context) {
        super(context, new DittoModel());
    }
}
