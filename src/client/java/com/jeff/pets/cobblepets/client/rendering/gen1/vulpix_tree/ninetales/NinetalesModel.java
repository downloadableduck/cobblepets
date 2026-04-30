package com.jeff.pets.cobblepets.client.rendering.gen1.vulpix_tree.ninetales;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.vulpix.Ninetales;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class NinetalesModel extends GeoModel<@NotNull Ninetales> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("ninetales");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/vulpix-tree/ninetales/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "ninetales.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Ninetales animatable) {
        return Utils.cobble("ninetales");
    }
}
