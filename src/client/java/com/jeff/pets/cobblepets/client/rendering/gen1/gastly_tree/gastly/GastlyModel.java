package com.jeff.pets.cobblepets.client.rendering.gen1.gastly_tree.gastly;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Gastly;
import net.minecraft.resources.Identifier;

public class GastlyModel extends GeoModel<Gastly> {
    @Override
    public String resourceLocation() {
        return "gastly";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/gastly-tree/gastly/", "gastly");
    }
}
