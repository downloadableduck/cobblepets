package com.jeff.pets.cobblepets.client.rendering.gen1.abra_tree.kadabra;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.abra.Kadabra;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class KadabraModel extends GeoModel<Kadabra> {
    @Override
    public String locationResource() {
        return "kadabra";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/abra-tree/kadabra/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "kadabra.png");
    }
}
