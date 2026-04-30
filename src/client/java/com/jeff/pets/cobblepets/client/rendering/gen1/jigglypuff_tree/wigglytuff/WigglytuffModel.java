package com.jeff.pets.cobblepets.client.rendering.gen1.jigglypuff_tree.wigglytuff;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.jigglypuff.Wigglytuff;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class WigglytuffModel extends GeoModel<@NotNull Wigglytuff> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("wigglytuff");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/jigglypuff-tree/wigglytuff/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "wigglytuff.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Wigglytuff animatable) {
        return Utils.cobble("wigglytuff");
    }
}
