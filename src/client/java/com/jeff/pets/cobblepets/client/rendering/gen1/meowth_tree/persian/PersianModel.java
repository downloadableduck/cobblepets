package com.jeff.pets.cobblepets.client.rendering.gen1.meowth_tree.persian;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.meowth.Persian;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PersianModel extends GeoModel<Persian> {
    @Override
    public String resourceLocation() {
        if (COBBLE_CONFIG.persianSkin.equals("alolan")) {
            return "persian_alolan";
        } else if (COBBLE_CONFIG.persianSkin.equals("galarian")) {
            return "persian_galarian";
        }
        return "persian";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String base = "textures/entity/meowth-tree/persian/";
        if (COBBLE_CONFIG.persianSkin.equals("alolan")) {
            if (COBBLE_CONFIG.isShiny) {
                return Utils.cobble(base + "alolan_shiny.png");
            }
            return Utils.cobble(base + "alolan.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "persian.png");
    }
}
