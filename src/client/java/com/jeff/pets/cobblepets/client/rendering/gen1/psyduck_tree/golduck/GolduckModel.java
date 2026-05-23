package com.jeff.pets.cobblepets.client.rendering.gen1.psyduck_tree.golduck;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GolduckModel extends GeoModel<com.jeff.pets.cobblepets.pets.gen1.psyduck.Golduck> {
    @Override
    public String locationResource() {
        return "golduck";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/psyduck-tree/golduck/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "golduck.png");
    }
}
