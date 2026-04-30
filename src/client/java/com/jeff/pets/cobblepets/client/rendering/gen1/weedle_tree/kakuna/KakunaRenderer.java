package com.jeff.pets.cobblepets.client.rendering.gen1.weedle_tree.kakuna;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Kakuna;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class KakunaRenderer extends CobbleRenderer<Kakuna> {
    public KakunaRenderer(EntityRendererProvider.Context context) {
        super(context, new KakunaModel());
    }
}
