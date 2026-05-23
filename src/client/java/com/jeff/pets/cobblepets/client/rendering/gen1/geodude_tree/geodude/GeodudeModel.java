package com.jeff.pets.cobblepets.client.rendering.gen1.geodude_tree.geodude;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Geodude;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GeodudeModel extends GeoModel<Geodude> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public Identifier getModelResource(GeoRenderState state) {
        if (COBBLE_CONFIG.geodudeSkin.equals("alolan")) {
            return Utils.cobble("geodude_alolan");
        }
        return Utils.cobble("geodude");
    }

    @Override
    public Identifier getAnimationResource(Geodude dude) {
        return Utils.cobble("geodude");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/geodude-tree/geodude/";
        if (COBBLE_CONFIG.geodudeSkin.equals("alolan")) {
            return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "alolan_shiny.png") : Utils.cobble(base + "alolan.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "geodude.png");
    }
}
