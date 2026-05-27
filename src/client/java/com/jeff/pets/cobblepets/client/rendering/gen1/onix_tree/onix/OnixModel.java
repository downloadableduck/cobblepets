package com.jeff.pets.cobblepets.client.rendering.gen1.onix_tree.onix;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.onix.Onix;
import net.minecraft.resources.Identifier;

public class OnixModel extends GeoModel<Onix> {
    @Override
    public String resourceLocation() {
        return "onix";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/onix-tree/onix/", "onix");
    }
}
