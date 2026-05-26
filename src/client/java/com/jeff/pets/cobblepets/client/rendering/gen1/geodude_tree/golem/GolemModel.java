package com.jeff.pets.cobblepets.client.rendering.gen1.geodude_tree.golem;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Golem;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GolemModel extends GeoModel<Golem> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        if (COBBLE_CONFIG.golemSkin.equals("alolan")) {
            return Utils.cobble("golem_alolan");
        }
        return Utils.cobble("golem");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Golem animatable) {
        return Utils.cobble("golem");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        String base = "textures/entity/geodude-tree/golem/";
        if (COBBLE_CONFIG.golemSkin.equals("alolan")) {
            return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "alolan_shiny.png") : Utils.cobble(base + "alolan.png");
        }
        return COBBLE_CONFIG.isShiny ? Utils.cobble(base + "shiny.png") : Utils.cobble(base + "golem.png");
    }
}
