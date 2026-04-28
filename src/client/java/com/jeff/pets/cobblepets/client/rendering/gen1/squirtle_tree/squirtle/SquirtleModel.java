package com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.squirtle;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Squirtle;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class SquirtleModel extends GeoModel<@NotNull Squirtle> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("squirtle");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/squirtle-tree/squirtle/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "squirtle.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Squirtle animatable) {
        return Utils.cobble("squirtle");
    }
}
