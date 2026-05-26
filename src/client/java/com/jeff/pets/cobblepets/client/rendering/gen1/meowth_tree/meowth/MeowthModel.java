package com.jeff.pets.cobblepets.client.rendering.gen1.meowth_tree.meowth;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.meowth.Meowth;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MeowthModel extends GeoModel<Meowth> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        if (COBBLE_CONFIG.meowthSkin.equals("alolan")) {
            return Utils.cobble("meowth_alolan");
        } else if (COBBLE_CONFIG.meowthSkin.equals("galarian")) {
            return Utils.cobble("meowth_galarian");
        }
        return Utils.cobble("meowth");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Meowth state) {
        return Utils.cobble("meowth");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String base = "textures/entity/meowth-tree/meowth/";
        if (COBBLE_CONFIG.meowthSkin.equals("alolan")) {
            if (COBBLE_CONFIG.isShiny) {
                return Utils.cobble(base + "alolan_shiny.png");
            }
            return Utils.cobble(base + "alolan.png");
        } else if (COBBLE_CONFIG.meowthSkin.equals("galarian")) {
            if (COBBLE_CONFIG.isShiny) {
                return Utils.cobble(base + "galarian_shiny.png");
            }
            return Utils.cobble(base + "galarian.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "meowth.png");
    }
}
