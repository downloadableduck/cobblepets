package com.jeff.pets.cobblepets.client.rendering.gen1.sandshrew_tree.sandslash;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandslash;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class SandslashRenderer extends CobbleRenderer<Sandslash, LivingEntityRenderState> {
    public SandslashRenderer(EntityRendererProvider.Context context) {
        super(context, new SandslashModel());
    }
}
