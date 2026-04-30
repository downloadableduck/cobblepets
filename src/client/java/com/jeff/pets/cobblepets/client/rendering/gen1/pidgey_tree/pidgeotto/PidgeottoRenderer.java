package com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgeotto;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeotto;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class PidgeottoRenderer extends CobbleRenderer<Pidgeotto> {
    public PidgeottoRenderer(EntityRendererProvider.Context context) {
        super(context, new PidgeottoModel());
    }
}
