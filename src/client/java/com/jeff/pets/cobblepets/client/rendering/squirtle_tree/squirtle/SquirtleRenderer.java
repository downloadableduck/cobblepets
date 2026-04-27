package com.jeff.pets.cobblepets.client.rendering.squirtle_tree.squirtle;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.squirtle.Squirtle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class SquirtleRenderer extends CobbleRenderer<Squirtle, LivingEntityRenderState> {
    public SquirtleRenderer(EntityRendererProvider.Context context) {
        super(context, new SquirtleModel());
    }
}
