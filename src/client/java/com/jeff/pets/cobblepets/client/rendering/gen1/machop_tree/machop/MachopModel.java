package com.jeff.pets.cobblepets.client.rendering.gen1.machop_tree.machop;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machop;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MachopModel extends GeoModel<Machop> {
    @Override
    public String locationResource() {
        return "machop";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/machop-tree/machop/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "machop.png");
    }
}
