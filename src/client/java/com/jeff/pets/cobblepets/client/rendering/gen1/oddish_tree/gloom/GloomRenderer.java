package com.jeff.pets.cobblepets.client.rendering.gen1.oddish_tree.gloom;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Gloom;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class GloomRenderer extends CobbleRenderer<Gloom> {
    public GloomRenderer(EntityRendererProvider.Context context) {
        super(context, new GloomModel());
    }
}
