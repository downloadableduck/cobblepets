package com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.ekans;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.ekans.Ekans;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class EkansModel extends GeoModel<@NotNull Ekans> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("ekans");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/ekans-tree/ekans/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "ekans.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Ekans animatable) {
        return Utils.cobble("ekans");
    }
}
