package com.jeff.pets.cobblepets.client.rendering.gen1.gastly_tree.gengar;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Gengar;
import net.minecraft.resources.Identifier;

public class GengarModel extends GeoModel<Gengar> {
    @Override
    public String resourceLocation() {
        return "gengar";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/gastly-tree/gengar/", "gengar");
    }
}
