package com.jeff.pets.cobblepets.client.rendering.gen1.tentacool_tree.tentacruel;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.tentacool.Tentacruel;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class TentacruelModel extends GeoModel<Tentacruel> {
    @Override
    public String resourceLocation() {
        return "tentacruel";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/tentacool-tree/tentacruel/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "tentacruel.png");
    }
}
