package com.jeff.pets.cobblepets.client.rendering.pidgey_tree.pidgeotto;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgeotto;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class PidgeottoModel extends GeoModel<@NotNull Pidgeotto> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("pidgeotto");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/pidgey-tree/pidgeotto/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "pidgeotto.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Pidgeotto animatable) {
        return Utils.cobble("pidgeotto");
    }
}
