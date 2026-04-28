package com.jeff.pets.cobblepets.client.rendering.gen1.weedle_tree.kakuna;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Kakuna;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class KakunaModel extends GeoModel<@NotNull Kakuna> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("kakuna");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/weedle-tree/kakuna/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "kakuna.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Kakuna animatable) {
        return Utils.cobble("kakuna");
    }
}
