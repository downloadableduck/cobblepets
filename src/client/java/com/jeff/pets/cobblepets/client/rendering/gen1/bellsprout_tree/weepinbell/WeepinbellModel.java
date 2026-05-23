package com.jeff.pets.cobblepets.client.rendering.gen1.bellsprout_tree.weepinbell;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Weepinbell;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class WeepinbellModel extends GeoModel<Weepinbell> {
    @Override
    public String resourceLocation() {
        return "weepinbell";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/bellsprout-tree/weepinbell/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "weepinbell.png");
    }
}
