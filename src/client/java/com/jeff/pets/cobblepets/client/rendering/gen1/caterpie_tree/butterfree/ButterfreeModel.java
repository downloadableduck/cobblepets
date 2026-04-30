package com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.butterfree;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Butterfree;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ButterfreeModel extends GeoModel<@NotNull Butterfree> {
    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble("butterfree");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/caterpie-tree/butterfree/";
        if (COBBLE_CONFIG.butterfreeSkin.equals("normal") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "butterfree.png");
        } else if (COBBLE_CONFIG.butterfreeSkin.equals("normal") && COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "shiny.png");
        } else if (COBBLE_CONFIG.butterfreeSkin.equals("valencian") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "valencian.png");
        } else {
            return Utils.cobble(id + "valencian_shiny.png");
        }
    }

    @Override
    public @NotNull Identifier getAnimationResource(Butterfree animatable) {
        return Utils.cobble("butterfree");
    }
}
