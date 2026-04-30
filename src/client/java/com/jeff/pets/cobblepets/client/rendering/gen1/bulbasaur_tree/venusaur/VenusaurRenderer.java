package com.jeff.pets.cobblepets.client.rendering.gen1.bulbasaur_tree.venusaur;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Venusaur;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class VenusaurRenderer extends CobbleRenderer<Venusaur> {
    public VenusaurRenderer(EntityRendererProvider.Context context) {
        super(context, new VenusaurModel());
    }
}
