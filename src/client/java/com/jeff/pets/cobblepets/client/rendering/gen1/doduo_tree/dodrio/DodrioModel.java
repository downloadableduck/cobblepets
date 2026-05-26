package com.jeff.pets.cobblepets.client.rendering.gen1.doduo_tree.dodrio;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.doduo.Dodrio;
import net.minecraft.resources.Identifier;

public class DodrioModel extends GeoModel<Dodrio> {
    @Override
    public String resourceLocation() {
        return "dodrio";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/doduo-tree/dodrio/", "dodrio");
    }
}
