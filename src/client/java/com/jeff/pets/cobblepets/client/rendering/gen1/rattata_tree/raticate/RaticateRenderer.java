package com.jeff.pets.cobblepets.client.rendering.gen1.rattata_tree.raticate;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Raticate;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class RaticateRenderer extends CobbleRenderer<Raticate, LivingEntityRenderState> {
    public RaticateRenderer(EntityRendererProvider.Context context) {
        super(context, new RaticateModel());
    }
}
