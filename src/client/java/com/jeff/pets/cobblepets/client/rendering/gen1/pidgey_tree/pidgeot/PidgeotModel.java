package com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgeot;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeot;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PidgeotModel extends GeoModel<@NotNull Pidgeot> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("pidgeot");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/pidgey-tree/pidgeot/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "pidgeot.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Pidgeot animatable) {
        return Utils.cobble("pidgeot");
    }
}
