package com.jeff.pets.cobblepets.client.rendering.gen1.pikachu_tree.raichu;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Raichu;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class RaichuRenderer extends CobbleRenderer<Raichu> {
    public RaichuRenderer(EntityRendererProvider.Context context) {
        super(context, new RaichuModel());
    }
}
