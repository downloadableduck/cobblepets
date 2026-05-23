package com.jeff.pets.cobblepets.client.rendering.gen1.growlith_tree.arcanine;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.growlith.Arcanine;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ArcanineModel extends GeoModel<Arcanine> {
    @Override
    public String resourceLocation() {
        return "arcanine";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/growlithe-tree/arcanine/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "arcanine.png");
    }
}
