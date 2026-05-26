package com.jeff.pets.cobblepets.client.rendering.gen1.shellder_tree.shellder;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.shellder.Shellder;
import net.minecraft.resources.Identifier;

public class ShellderModel extends GeoModel<Shellder> {
    @Override
    public String resourceLocation() {
        return "shellder";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/shellder-tree/shellder/", "shellder");
    }
}
