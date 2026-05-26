package com.jeff.pets.cobblepets.client.rendering.gen1.gastly_tree.haunter;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Haunter;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class HaunterRenderer extends CobbleRenderer<Haunter> {
    public HaunterRenderer(EntityRendererProvider.Context context) {
        super(context, new HaunterModel());
    }
}
