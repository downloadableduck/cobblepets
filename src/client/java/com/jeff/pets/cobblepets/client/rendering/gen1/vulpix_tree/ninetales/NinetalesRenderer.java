package com.jeff.pets.cobblepets.client.rendering.gen1.vulpix_tree.ninetales;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.vulpix.Ninetales;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class NinetalesRenderer extends CobbleRenderer<Ninetales> {
    public NinetalesRenderer(EntityRendererProvider.Context context) {
        super(context, new NinetalesModel());
    }
}
