package com.jeff.pets.cobblepets.client.rendering.gen1.poliwag_tree.poliwag;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwag;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PoliwagModel extends GeoModel<Poliwag> {
    @Override
    public String locationResource() {
        return "poliwag";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/poliwag-tree/poliwag/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "poliwag.png");
    }
}
