package com.jeff.pets.cobblepets.client.rendering.gen1.growlith_tree.growlith;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.growlith.Growlith;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GrowlithModel extends GeoModel<Growlith> {
    @Override
    public String locationResource() {
        return "growlithe";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/growlithe-tree/growlithe/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "growlithe.png");
    }
}
