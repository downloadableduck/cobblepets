package com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgeot;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeot;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class PidgeotRenderer extends CobbleRenderer<Pidgeot> {
    public PidgeotRenderer(EntityRendererProvider.Context context) {
        super(context, new PidgeotModel());
    }
}
