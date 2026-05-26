package com.jeff.pets.cobblepets.client.rendering.gen1.gastly_tree.haunter;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Haunter;
import net.minecraft.resources.Identifier;

public class HaunterModel extends GeoModel<Haunter> {
    @Override
    public String resourceLocation() {
        return "haunter";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/gastly-tree/haunter/", "haunter");
    }
}
