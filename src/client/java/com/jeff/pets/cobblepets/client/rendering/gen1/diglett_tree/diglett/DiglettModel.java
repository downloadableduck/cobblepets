package com.jeff.pets.cobblepets.client.rendering.gen1.diglett_tree.diglett;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.diglett.Diglett;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class DiglettModel extends GeoModel<Diglett> {
    @Override
    public String resourceLocation() {
        return "diglett";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/diglett-tree/diglett/";
        if (COBBLE_CONFIG.diglettSkin.equals("normal") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "diglett.png");
        } else if (COBBLE_CONFIG.diglettSkin.equals("normal") && COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "shiny.png");
        } else if (COBBLE_CONFIG.diglettSkin.equals("alolan") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "alolan.png");
        } else {
            return Utils.cobble(id + "alolan_shiny.png");
        }
    }
}
