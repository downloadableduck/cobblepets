package com.jeff.pets.cobblepets.client.rendering.gen1.sandshrew_tree.sandslash;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandslash;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class SandslashModel extends GeoModel<@NotNull Sandslash> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("sandslash");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/sandshrew-tree/sandslash/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "sandslash.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Sandslash animatable) {
        return Utils.cobble("sandslash");
    }
}
