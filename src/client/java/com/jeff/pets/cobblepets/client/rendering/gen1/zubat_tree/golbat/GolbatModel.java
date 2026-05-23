package com.jeff.pets.cobblepets.client.rendering.gen1.zubat_tree.golbat;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.zubat.Golbat;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GolbatModel extends GeoModel<Golbat> {
    @Override
    public String resourceLocation() {
        return "golbat";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {

        String id = "textures/entity/zubat-tree/golbat/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "golbat1.png");
    }
}
