package com.jeff.pets.cobblepets.client.rendering.gen1.krabby_tree.kingler;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.krabby.Kingler;
import net.minecraft.resources.Identifier;

public class KinglerModel extends GeoModel<Kingler> {
    @Override
    public String resourceLocation() {
        return "kingler";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/krabby-tree/kingler/", "kingler");
    }
}
