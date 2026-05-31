package com.jeff.pets.cobblepets.client.rendering.gen5.snivy_tree.snivy;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Snivy;
import net.minecraft.resources.Identifier;

public class SnivyModel extends GeoModel<Snivy> {
    @Override
    public String resourceLocation() {
        return "snivy";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Utils.getSkin("textures/entity/gen5/snivy-tree/snivy/", "snivy");
    }
}
