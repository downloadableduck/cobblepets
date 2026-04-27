package com.jeff.pets.cobblepets.client.rendering.rattata_tree.raticate;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.rattata.Raticate;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class RaticateRenderer extends CobbleRenderer<Raticate, LivingEntityRenderState> {
    public RaticateRenderer(EntityRendererProvider.Context context) {
        super(context, new RaticateModel());
    }
}
