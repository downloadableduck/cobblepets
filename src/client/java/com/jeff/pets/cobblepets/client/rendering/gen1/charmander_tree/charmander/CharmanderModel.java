package com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charmander;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmander;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class CharmanderModel extends GeoModel<@NotNull Charmander> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("charmander");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/charmander-tree/charmander/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "charmander.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Charmander animatable) {
        return Utils.cobble("charmander");
    }
}
