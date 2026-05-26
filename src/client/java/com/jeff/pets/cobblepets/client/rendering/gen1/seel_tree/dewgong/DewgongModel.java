package com.jeff.pets.cobblepets.client.rendering.gen1.seel_tree.dewgong;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.seel.Dewgong;
import net.minecraft.resources.Identifier;

public class DewgongModel extends GeoModel<Dewgong> {
    @Override
    public String resourceLocation() {
        return "dewgong";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/seel-tree/dewgong/", "dewgong");
    }
}
