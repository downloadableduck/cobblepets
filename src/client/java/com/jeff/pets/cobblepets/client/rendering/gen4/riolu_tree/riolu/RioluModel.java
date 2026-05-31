package com.jeff.pets.cobblepets.client.rendering.gen4.riolu_tree.riolu;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Riolu;
import net.minecraft.resources.Identifier;

public class RioluModel extends GeoModel<Riolu> {
    @Override
    public String resourceLocation() {
        return "riolu";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/gen4/riolu-tree/riolu/", "riolu");
    }
}
