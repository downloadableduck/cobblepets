package com.jeff.pets.cobblepets.client.rendering.weedle_tree.beedrill;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.weedle.Beedrill;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class BeedrillRenderer extends CobbleRenderer<Beedrill, LivingEntityRenderState> {
    public BeedrillRenderer(EntityRendererProvider.Context context) {
        super(context, new BeedrillModel());
    }
}
