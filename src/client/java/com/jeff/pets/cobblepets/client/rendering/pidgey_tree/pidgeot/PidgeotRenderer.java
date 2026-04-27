package com.jeff.pets.cobblepets.client.rendering.pidgey_tree.pidgeot;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgeot;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class PidgeotRenderer extends CobbleRenderer<Pidgeot, LivingEntityRenderState> {
    public PidgeotRenderer(EntityRendererProvider.Context context) {
        super(context, new PidgeotModel());
    }
}
