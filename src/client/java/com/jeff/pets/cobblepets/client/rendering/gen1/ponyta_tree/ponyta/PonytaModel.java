package com.jeff.pets.cobblepets.client.rendering.gen1.ponyta_tree.ponyta;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Graveler;
import com.jeff.pets.cobblepets.pets.gen1.ponyta.Ponyta;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PonytaModel extends GeoModel<Ponyta> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        if (COBBLE_CONFIG.ponytaSkin.equals("galarian")) {
            return Utils.cobble("ponyta_galarian");
        }
        return Utils.cobble("ponyta");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Ponyta animatable) {
        return Utils.cobble("ponyta");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/ponyta-tree/ponyta/";
        if (COBBLE_CONFIG.ponytaSkin.equals("galarian")) {
            return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "galarian_shiny.png") : Utils.cobble(base + "galarian.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "ponyta.png");
    }
}
