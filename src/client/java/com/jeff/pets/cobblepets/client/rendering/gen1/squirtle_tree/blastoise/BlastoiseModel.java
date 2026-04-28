package com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.blastoise;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Blastoise;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class BlastoiseModel extends GeoModel<@NotNull Blastoise> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("blastoise");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/squirtle-tree/blastoise/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "blastoise.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Blastoise animatable) {
        return Utils.cobble("blastoise");
    }
}
