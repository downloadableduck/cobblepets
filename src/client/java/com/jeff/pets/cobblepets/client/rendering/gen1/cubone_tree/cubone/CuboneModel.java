package com.jeff.pets.cobblepets.client.rendering.gen1.cubone_tree.cubone;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.cubone.Cubone;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;

public class CuboneModel extends GeoModel<Cubone> {
    @Override
    public String resourceLocation() {
        return "cubone";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Utils.getSkin("textures/entity/cubone-tree/cubone/", "cubone");
    }
}
