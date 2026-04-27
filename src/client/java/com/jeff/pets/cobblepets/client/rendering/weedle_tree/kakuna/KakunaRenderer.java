package com.jeff.pets.cobblepets.client.rendering.weedle_tree.kakuna;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.weedle.Kakuna;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class KakunaRenderer extends CobbleRenderer<Kakuna, LivingEntityRenderState> {
    public KakunaRenderer(EntityRendererProvider.Context context) {
        super(context, new KakunaModel());
    }
}
