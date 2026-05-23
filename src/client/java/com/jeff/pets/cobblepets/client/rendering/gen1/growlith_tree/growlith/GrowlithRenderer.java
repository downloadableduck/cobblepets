package com.jeff.pets.cobblepets.client.rendering.gen1.growlith_tree.growlith;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.growlith.Growlith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GrowlithRenderer extends CobbleRenderer<Growlith> {
    public GrowlithRenderer(EntityRendererProvider.Context context) {
        super(context, new GrowlithModel());
    }
}
