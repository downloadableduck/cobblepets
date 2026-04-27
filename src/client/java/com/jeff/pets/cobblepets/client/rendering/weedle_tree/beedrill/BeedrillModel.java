package com.jeff.pets.cobblepets.client.rendering.weedle_tree.beedrill;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.weedle.Beedrill;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class BeedrillModel extends GeoModel<@NotNull Beedrill> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("beedrill");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/weedle-tree/beedrill/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "beedrill.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Beedrill animatable) {
        return Utils.cobble("beedrill");
    }
}