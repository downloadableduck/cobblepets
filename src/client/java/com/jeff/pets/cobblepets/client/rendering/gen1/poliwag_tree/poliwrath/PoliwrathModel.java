package com.jeff.pets.cobblepets.client.rendering.gen1.poliwag_tree.poliwrath;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwrath;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PoliwrathModel extends GeoModel<Poliwrath> {
    @Override
    public String resourceLocation() {
        return "poliwrath";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/poliwag-tree/poliwrath/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "poliwrath.png");
    }
}
