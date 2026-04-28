package com.jeff.pets.cobblepets.client.rendering.gen1.pikachu_tree.raichu;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Raichu;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class RaichuModel extends GeoModel<@NotNull Raichu> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("raichu");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/pikachu-tree/raichu/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "raichu.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Raichu animatable) {
        return Utils.cobble("raichu");
    }
}
