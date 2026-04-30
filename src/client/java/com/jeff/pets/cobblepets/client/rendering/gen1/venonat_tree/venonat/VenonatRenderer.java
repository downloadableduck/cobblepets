package com.jeff.pets.cobblepets.client.rendering.gen1.venonat_tree.venonat;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.venonat.Venonat;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class VenonatRenderer extends CobbleRenderer<Venonat> {
    public VenonatRenderer(EntityRendererProvider.Context context) {
        super(context, new VenonatModel());
    }
}
