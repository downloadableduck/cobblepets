package com.jeff.pets.cobblepets.client.rendering.gen1.gastly_tree.gastly;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Gastly;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GastlyRenderer extends CobbleRenderer<Gastly> {
    public GastlyRenderer(EntityRendererProvider.Context context) {
        super(context, new GastlyModel());
    }
}
