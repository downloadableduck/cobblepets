package com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.metapod;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Metapod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class MetapodRenderer extends CobbleRenderer<Metapod, LivingEntityRenderState> {
    public MetapodRenderer(EntityRendererProvider.Context context) {
        super(context, new MetapodModel());
    }
}
