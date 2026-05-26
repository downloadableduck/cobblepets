package com.jeff.pets.cobblepets.client.rendering.gen1.ponyta_tree.rapidash;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Graveler;
import com.jeff.pets.cobblepets.pets.gen1.ponyta.Rapidash;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class RapidashModel extends GeoModel<Rapidash> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        if (COBBLE_CONFIG.rapidashSkin.equals("galarian")) {
            return Utils.cobble("rapidash_galarian");
        }
        return Utils.cobble("rapidash");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Rapidash animatable) {
        return Utils.cobble("rapidash");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/ponyta-tree/rapidash/";
        if (COBBLE_CONFIG.rapidashSkin.equals("galarian")) {
            return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "galarian_shiny.png") : Utils.cobble(base + "galarian.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "rapidash.png");
    }
}
