package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranm_tree.nidoranm;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidoranm;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class NidoranmModel extends GeoModel<@NotNull Nidoranm> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("nidoranm");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/nidoranm-tree/nidoranm/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "nidoranm.png");

    }

    @Override
    public @NotNull Identifier getAnimationResource(Nidoranm animatable) {
        return Utils.cobble("nidoranm");
    }
}
