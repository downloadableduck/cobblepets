package com.jeff.pets.cobblepets.client.rendering.gen1.seel_tree.seel;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.seel.Seel;
import net.minecraft.resources.Identifier;

public class SeelModel extends GeoModel<Seel> {
    @Override
    public String resourceLocation() {
        return "seel";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/seel-tree/seel/", "seel");
    }
}
