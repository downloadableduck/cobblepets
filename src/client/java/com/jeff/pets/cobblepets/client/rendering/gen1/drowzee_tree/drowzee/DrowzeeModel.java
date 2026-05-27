package com.jeff.pets.cobblepets.client.rendering.gen1.drowzee_tree.drowzee;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.drowzee.Drowzee;
import net.minecraft.resources.Identifier;

public class DrowzeeModel extends GeoModel<Drowzee> {
    @Override
    public String resourceLocation() {
        return "drowzee";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/drowzee-tree/drowzee/", "drowzee");
    }
}
