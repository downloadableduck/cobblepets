package com.jeff.pets.cobblepets.client.rendering.gen5.snivy_tree.servine;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Servine;
import net.minecraft.resources.Identifier;

public class ServineModel extends GeoModel<Servine> {
    @Override
    public String resourceLocation() {
        return "servine";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Utils.getSkin("textures/entity/gen5/snivy-tree/servine/", "servine");
    }
}
