package com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.bulbasaur_tree.ivysaur;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Ivysaur;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class IvysaurModel extends GeoModel<@NotNull Ivysaur> {
    public IvysaurModel() {
        super();
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("ivysaur");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/bulbasaur-tree/ivysaur/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "ivysaur.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Ivysaur animatable) {
        return Utils.cobble("ivysaur");
    }
}
