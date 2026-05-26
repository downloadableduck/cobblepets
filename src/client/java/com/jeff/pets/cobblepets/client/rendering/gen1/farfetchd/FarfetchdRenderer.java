package com.jeff.pets.cobblepets.client.rendering.gen1.farfetchd;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.farfetchd.Farfetchd;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class FarfetchdRenderer extends CobbleRenderer<Farfetchd> {
    public FarfetchdRenderer(EntityRendererProvider.Context context) {
        super(context, new FarfetchdModel());
    }
}
