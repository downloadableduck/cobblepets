package com.jeff.pets.cobblepets.client.rendering.gen1.tentacool_tree.tentacool;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.tentacool.Tentacool;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class TentacoolModel extends GeoModel<Tentacool> {
    @Override
    public String resourceLocation() {
        return "tentacool";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String base = "textures/entity/tentacool-tree/tentacool/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "tentacool.png");
    }
}
