package com.jeff.pets.cobblepets.client.rendering.gen1.mew_tree.mew;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mew;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MewModel extends GeoModel<Mew> {
    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return Utils.cobble("mew");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String id = "textures/entity/mew-tree/mew/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "mew.png");
    }

    @Override
    public Identifier getAnimationResource(Mew animatable) {
        return Utils.cobble("mew");
    }
}
