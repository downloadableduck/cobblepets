package com.jeff.pets.cobblepets.client.rendering.gen1.sandshrew_tree.sandshrew;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandshrew;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class SandshrewModel extends GeoModel<@NotNull Sandshrew> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("sandshrew");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/sandshrew-tree/sandshrew/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "sandshrew.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Sandshrew animatable) {
        return Utils.cobble("sandshrew");
    }
}
