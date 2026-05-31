package com.jeff.pets.cobblepets.client.rendering.gen5.snivy_tree.serperior;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Serperior;
import net.minecraft.resources.Identifier;

public class SerperiorModel extends GeoModel<Serperior> {
    @Override
    public String resourceLocation() {
        return "serperior";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Utils.getSkin("textures/entity/gen5/snivy-tree/serperior/", "serperior");
    }
}
