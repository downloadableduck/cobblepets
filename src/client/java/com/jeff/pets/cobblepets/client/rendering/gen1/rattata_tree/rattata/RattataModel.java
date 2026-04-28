package com.jeff.pets.cobblepets.client.rendering.gen1.rattata_tree.rattata;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Rattata;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class RattataModel extends GeoModel<@NotNull Rattata> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("rattata");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String id = "textures/entity/rattata-tree/rattata/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "rattata.png");
    }

    @Override
    public Identifier getAnimationResource(Rattata animatable) {
        return Utils.cobble("rattata");
    }
}
