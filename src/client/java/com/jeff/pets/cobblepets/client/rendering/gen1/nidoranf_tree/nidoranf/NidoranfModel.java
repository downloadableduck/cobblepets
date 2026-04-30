package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranf_tree.nidoranf;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoranf;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class NidoranfModel extends GeoModel<@NotNull Nidoranf> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("nidoranf");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/nidoranf-tree/nidoranf/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "nidoranf.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Nidoranf animatable) {
        return Utils.cobble("nidoranf");
    }
}
