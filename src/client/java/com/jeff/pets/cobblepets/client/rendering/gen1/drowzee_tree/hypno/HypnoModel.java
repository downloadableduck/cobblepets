package com.jeff.pets.cobblepets.client.rendering.gen1.drowzee_tree.hypno;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.drowzee.Hypno;
import net.minecraft.resources.Identifier;

public class HypnoModel extends GeoModel<Hypno> {
    @Override
    public String resourceLocation() {
        return "hypno";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/drowzee-tree/hypno/", "hypno");
    }
}
