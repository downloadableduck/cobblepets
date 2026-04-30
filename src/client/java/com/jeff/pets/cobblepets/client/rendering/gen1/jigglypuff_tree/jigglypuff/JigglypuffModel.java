package com.jeff.pets.cobblepets.client.rendering.gen1.jigglypuff_tree.jigglypuff;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.jigglypuff.Jigglypuff;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class JigglypuffModel extends GeoModel<@NotNull Jigglypuff> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("jigglypuff");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/jigglypuff-tree/jigglypuff/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "jigglypuff.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Jigglypuff animatable) {
        return Utils.cobble("jigglypuff");
    }
}
