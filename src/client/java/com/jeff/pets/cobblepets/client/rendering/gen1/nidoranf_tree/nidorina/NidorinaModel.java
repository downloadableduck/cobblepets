package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranf_tree.nidorina;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidorina;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class NidorinaModel extends GeoModel<@NotNull Nidorina> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("nidorina");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/nidoranf-tree/nidorina/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "nidorina.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Nidorina animatable) {
        return Utils.cobble("nidorina");
    }
}
