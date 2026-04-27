package com.jeff.pets.cobblepets.client.rendering.caterpie_tree.caterpie;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.caterpie.Caterpie;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class CaterpieModel extends GeoModel<@NotNull Caterpie> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("caterpie");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/caterpie-tree/caterpie/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "caterpie.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Caterpie animatable) {
        return Utils.cobble("caterpie");
    }
}
