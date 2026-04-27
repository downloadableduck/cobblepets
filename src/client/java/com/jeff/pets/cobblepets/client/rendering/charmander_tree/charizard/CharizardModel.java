package com.jeff.pets.cobblepets.client.rendering.charmander_tree.charizard;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.charmander.Charizard;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class CharizardModel extends GeoModel<@NotNull Charizard> {

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("charizard");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/charmander-tree/charizard/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "charizard.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Charizard animatable) {
        return Utils.cobble("charizard");
    }
}
