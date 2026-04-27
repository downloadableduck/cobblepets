package com.jeff.pets.cobblepets.client.rendering.weedle_tree.weedle;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.weedle.Weedle;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class WeedleModel extends GeoModel<@NotNull Weedle> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("weedle");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/weedle-tree/weedle/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "weedle.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Weedle animatable) {
        return Utils.cobble("weedle");
    }
}
