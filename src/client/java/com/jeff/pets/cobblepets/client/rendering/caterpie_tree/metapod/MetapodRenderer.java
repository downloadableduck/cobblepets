package com.jeff.pets.cobblepets.client.rendering.caterpie_tree.metapod;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.caterpie.Metapod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class MetapodRenderer extends CobbleRenderer<Metapod, LivingEntityRenderState> {
    public MetapodRenderer(EntityRendererProvider.Context context) {
        super(context, new MetapodModel());
    }
}
