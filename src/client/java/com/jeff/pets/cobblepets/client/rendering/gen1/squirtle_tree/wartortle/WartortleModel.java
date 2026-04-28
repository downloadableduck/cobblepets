package com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.wartortle;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Wartortle;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class WartortleModel extends GeoModel<@NotNull Wartortle> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("wartortle");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/squirtle-tree/wartortle/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "wartortle.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Wartortle animatable) {
        return Utils.cobble("wartortle");
    }
}
