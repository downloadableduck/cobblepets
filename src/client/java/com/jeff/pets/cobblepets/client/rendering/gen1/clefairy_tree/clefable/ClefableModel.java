package com.jeff.pets.cobblepets.client.rendering.gen1.clefairy_tree.clefable;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.clefairy.Clefable;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ClefableModel extends GeoModel<@NotNull Clefable> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("clefable");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/clefairy-tree/clefable/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "clefable.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Clefable animatable) {
        return Utils.cobble("clefable");
    }
}
