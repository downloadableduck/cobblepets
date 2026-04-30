package com.jeff.pets.cobblepets.client.rendering.gen1.oddish_tree.oddish;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Oddish;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class OddishModel extends GeoModel<Oddish> {
    @Override
    public String locationResource() {
        return "oddish";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/oddish-tree/oddish/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "oddish.png");
    }
}
