package com.jeff.pets.cobblepets.client.rendering.gen1.abra_tree.alakazam;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.abra.Alakazam;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class AlakazamModel extends GeoModel<Alakazam> {
    @Override
    public String resourceLocation() {
        return "alakazam";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/abra-tree/alakazam/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "alakazam.png");
    }
}
