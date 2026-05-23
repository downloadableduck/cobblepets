package com.jeff.pets.cobblepets.client.rendering.gen1.geodude_tree.graveler;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Graveler;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GravelerRenderer extends CobbleRenderer<Graveler> {
    public GravelerRenderer(EntityRendererProvider.Context context) {
        super(context, new GravelerModel());
    }
}
