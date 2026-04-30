package com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.caterpie;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Caterpie;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class CaterpieRenderer extends CobbleRenderer<Caterpie> {
    public CaterpieRenderer(EntityRendererProvider.Context context) {
        super(context, new CaterpieModel());
    }
}
