package com.jeff.pets.cobblepets.client.rendering.gen1.mankey_tree.mankey;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.mankey.Mankey;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MankeyModel extends GeoModel<Mankey> {
    @Override
    public String locationResource() {
        return "mankey";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/mankey-tree/mankey/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "mankey.png");
    }
}
