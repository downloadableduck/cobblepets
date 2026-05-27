package com.jeff.pets.cobblepets.client.rendering.gen1.krabby_tree.krabby;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.krabby.Krabby;
import net.minecraft.resources.Identifier;

public class KrabbyModel extends GeoModel<Krabby> {
    @Override
    public String resourceLocation() {
        return "krabby";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/krabby-tree/krabby/", "krabby");
    }
}
