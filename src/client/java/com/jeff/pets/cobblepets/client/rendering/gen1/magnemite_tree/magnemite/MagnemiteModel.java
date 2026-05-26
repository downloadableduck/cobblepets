package com.jeff.pets.cobblepets.client.rendering.gen1.magnemite_tree.magnemite;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.magnamite.Magnemite;
import net.minecraft.resources.Identifier;

public class MagnemiteModel extends GeoModel<Magnemite> {
    @Override
    public String resourceLocation() {
        return "magnemite";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/magnemite-tree/magnemite/", "magnemite");
    }
}
