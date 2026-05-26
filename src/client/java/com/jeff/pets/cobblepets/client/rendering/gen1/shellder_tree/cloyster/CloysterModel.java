package com.jeff.pets.cobblepets.client.rendering.gen1.shellder_tree.cloyster;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.shellder.Cloyster;
import net.minecraft.resources.Identifier;

public class CloysterModel extends GeoModel<Cloyster> {
    @Override
    public String resourceLocation() {
        return "cloyster";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/shellder-tree/cloyster/", "cloyster");
    }
}
