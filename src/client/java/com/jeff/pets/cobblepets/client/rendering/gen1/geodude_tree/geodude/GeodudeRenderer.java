package com.jeff.pets.cobblepets.client.rendering.gen1.geodude_tree.geodude;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Geodude;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GeodudeRenderer extends CobbleRenderer<Geodude> {
    public GeodudeRenderer(EntityRendererProvider.Context context) {
        super(context, new GeodudeModel());
    }
}
