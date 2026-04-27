package com.jeff.pets.cobblepets.client.rendering.pidgey_tree.pidgey;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgey;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class PidgeyRenderer extends CobbleRenderer<Pidgey, LivingEntityRenderState> {
    public PidgeyRenderer(EntityRendererProvider.Context context) {
        super(context, new PidgeyModel());
    }
}
