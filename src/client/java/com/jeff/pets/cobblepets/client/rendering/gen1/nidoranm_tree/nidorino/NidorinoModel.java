package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranm_tree.nidorino;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidoranm;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidorino;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class NidorinoModel extends GeoModel<@NotNull Nidorino> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("nidorino");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/nidoranm-tree/nidorino/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "nidorino.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Nidorino animatable) {
        return Utils.cobble("nidorino");
    }
}
