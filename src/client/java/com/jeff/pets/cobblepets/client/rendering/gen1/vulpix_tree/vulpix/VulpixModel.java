package com.jeff.pets.cobblepets.client.rendering.gen1.vulpix_tree.vulpix;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.vulpix.Vulpix;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class VulpixModel extends GeoModel<@NotNull Vulpix> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("vulpix");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/vulpix-tree/vulpix/";
        return COBBLE_CONFIG.isShiny ? Utils.cobble(id + "shiny.png") : Utils.cobble(id + "vulpix.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(Vulpix animatable) {
        return Utils.cobble("vulpix");
    }
}
