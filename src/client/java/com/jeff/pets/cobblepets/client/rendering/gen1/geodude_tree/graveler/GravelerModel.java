package com.jeff.pets.cobblepets.client.rendering.gen1.geodude_tree.graveler;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Graveler;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GravelerModel extends GeoModel<Graveler> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        if (COBBLE_CONFIG.gravelerSkin.equals("alolan")) {
            return Utils.cobble("graveler_alolan");
        }
        return Utils.cobble("graveler");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Graveler animatable) {
        return Utils.cobble("graveler");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/geodude-tree/graveler/";
        if (COBBLE_CONFIG.gravelerSkin.equals("alolan")) {
            return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "alolan_shiny.png") : Utils.cobble(base + "alolan.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "graveler.png");
    }
}
