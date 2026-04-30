package com.jeff.pets.cobblepets.client.rendering.gen1.mew_tree.mew;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mew;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class MewRenderer extends CobbleRenderer<Mew> {
    public MewRenderer(EntityRendererProvider.Context context) {
        super(context, new MewModel());
    }
}
