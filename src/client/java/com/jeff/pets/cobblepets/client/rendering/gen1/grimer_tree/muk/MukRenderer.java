package com.jeff.pets.cobblepets.client.rendering.gen1.grimer_tree.muk;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Muk;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MukRenderer extends CobbleRenderer<Muk> {
    public MukRenderer(EntityRendererProvider.Context context) {
        super(context, new MukModel());
    }
}
