package com.jeff.pets.cobblepets.client.rendering.gen1.doduo_tree.doduo;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import com.jeff.pets.cobblepets.pets.gen1.doduo.Doduo;
import net.minecraft.resources.Identifier;

public class DoduoModel extends GeoModel<Doduo> {
    @Override
    public String resourceLocation() {
        return "doduo";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/doduo-tree/doduo/", "doduo");
    }
}
