package com.jeff.pets.cobblepets.client.rendering.gen1.rattata_tree.raticate;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Raticate;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class RaticateModel extends GeoModel<@NotNull Raticate> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("raticate");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/rattata-tree/raticate/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "raticate.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Raticate animatable) {
        return Utils.cobble("raticate");
    }
}
