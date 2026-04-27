package com.jeff.pets.cobblepets.client.rendering.squirtle_tree.wartortle;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.squirtle.Wartortle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class WartortleRenderer extends CobbleRenderer<Wartortle, LivingEntityRenderState> {
    public WartortleRenderer(EntityRendererProvider.Context context) {
        super(context, new WartortleModel());
    }
}
