package com.jeff.pets.cobblepets.client.rendering.charmander_tree.charmeleon;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.charmander.Charmeleon;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class CharmeleonModel extends GeoModel<@NotNull Charmeleon> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("charmeleon");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/charmander-tree/charmeleon/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "charmeleon.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Charmeleon animatable) {
        return Utils.cobble("charmeleon");
    }
}
