package com.jeff.pets.cobblepets.client.rendering.weedle_tree.weedle;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.weedle.Weedle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class WeedleRenderer extends CobbleRenderer<Weedle, LivingEntityRenderState> {
    public WeedleRenderer(EntityRendererProvider.Context context) {
        super(context, new WeedleModel());
    }
}
