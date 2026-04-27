package com.jeff.pets.cobblepets.client.rendering.pidgey_tree.pidgeotto;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgeotto;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class PidgeottoRenderer extends CobbleRenderer<Pidgeotto, LivingEntityRenderState> {
    public PidgeottoRenderer(EntityRendererProvider.Context context) {
        super(context, new PidgeottoModel());
    }
}
