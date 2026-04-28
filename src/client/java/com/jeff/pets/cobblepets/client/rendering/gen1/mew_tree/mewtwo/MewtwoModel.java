package com.jeff.pets.cobblepets.client.rendering.gen1.mew_tree.mewtwo;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mewtwo;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MewtwoModel extends GeoModel<Mewtwo> {
    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return Utils.cobble("mewtwo");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String id = "textures/entity/mew-tree/mewtwo/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "mewtwo.png");
    }

    @Override
    public Identifier getAnimationResource(Mewtwo animatable) {
        return Utils.cobble("mewtwo");
    }
}
