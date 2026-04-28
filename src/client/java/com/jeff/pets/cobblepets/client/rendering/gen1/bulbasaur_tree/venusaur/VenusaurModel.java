package com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.bulbasaur_tree.venusaur;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Venusaur;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class VenusaurModel extends GeoModel<@NotNull Venusaur> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("venusaur");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/bulbasaur-tree/venusaur/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "venusaur.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Venusaur animatable) {
        return Utils.cobble("venusaur");
    }
}
