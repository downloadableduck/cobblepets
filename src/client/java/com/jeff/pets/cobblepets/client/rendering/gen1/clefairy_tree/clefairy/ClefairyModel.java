package com.jeff.pets.cobblepets.client.rendering.gen1.clefairy_tree.clefairy;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.clefairy.Clefairy;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ClefairyModel extends GeoModel<@NotNull Clefairy> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("clefairy");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/clefairy-tree/clefairy/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "clefairy.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Clefairy animatable) {
        return Utils.cobble("clefairy");
    }
}
