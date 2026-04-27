package com.jeff.pets.cobblepets.client.rendering.ditto;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.ditto.Ditto;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class DittoModel extends GeoModel<Ditto> {
    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return Utils.cobble("ditto");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String id = "textures/entity/ditto/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "ditto.png");
    }

    @Override
    public Identifier getAnimationResource(Ditto animatable) {
        return Utils.cobble("ditto");
    }
}
