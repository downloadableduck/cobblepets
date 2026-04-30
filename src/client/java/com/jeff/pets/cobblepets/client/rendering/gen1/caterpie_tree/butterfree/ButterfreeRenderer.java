package com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.butterfree;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Butterfree;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class ButterfreeRenderer extends CobbleRenderer<Butterfree> {
    public ButterfreeRenderer(EntityRendererProvider.Context context) {
        super(context, new ButterfreeModel());
    }
}
