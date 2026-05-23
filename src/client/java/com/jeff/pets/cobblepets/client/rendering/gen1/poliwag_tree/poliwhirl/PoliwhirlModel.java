package com.jeff.pets.cobblepets.client.rendering.gen1.poliwag_tree.poliwhirl;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwhirl;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PoliwhirlModel extends GeoModel<Poliwhirl> {
    @Override
    public String locationResource() {
        return "poliwhirl";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String base = "textures/entity/poliwag-tree/poliwhirl/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "poliwhirl.png");
    }
}
