package com.jeff.pets.cobblepets.client.rendering.gen1.pikachu_tree.pikachu;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Pikachu;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PikachuModel extends GeoModel<@NotNull Pikachu> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("pikachu");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/pikachu-tree/pikachu/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "pikachu.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Pikachu animatable) {
        return Utils.cobble("pikachu");
    }
}
