package com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgey;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgey;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PidgeyModel extends GeoModel<@NotNull Pidgey> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("pidgey");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/pidgey-tree/pidgey/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "pidgey.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Pidgey animatable) {
        return Utils.cobble("pidgey");
    }
}
