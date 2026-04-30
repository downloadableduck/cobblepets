package com.jeff.pets.cobblepets.client.rendering.gen1.sandshrew_tree.sandshrew;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandshrew;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class SandshrewRenderer extends CobbleRenderer<Sandshrew> {
    public SandshrewRenderer(EntityRendererProvider.Context context) {
        super(context, new SandshrewModel());
    }
}
