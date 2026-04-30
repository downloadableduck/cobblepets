package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranf_tree.nidoqueen;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoqueen;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class NidoqueenModel extends GeoModel<@NotNull Nidoqueen> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("nidoqueen");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/nidoranf-tree/nidoqueen/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "nidoqueen.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Nidoqueen animatable) {
        return Utils.cobble("nidoqueen");
    }
}
