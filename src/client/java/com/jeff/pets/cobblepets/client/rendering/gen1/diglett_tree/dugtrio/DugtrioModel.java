package com.jeff.pets.cobblepets.client.rendering.gen1.diglett_tree.dugtrio;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen1.diglett.Dugtrio;
import me.shedaniel.autoconfig.annotation.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class DugtrioModel extends GeoModel<@NotNull Dugtrio> {

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        if (COBBLE_CONFIG.dugtrioSkin.equals("alolan")) {
            return Utils.cobble("dugtrio_alolan");
        } else {
            return Utils.cobble("dugtrio");
        }
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/diglett-tree/dugtrio/";
        if (COBBLE_CONFIG.dugtrioSkin.equals("normal") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "dugtrio.png");
        } else if (COBBLE_CONFIG.dugtrioSkin.equals("normal") && COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "shiny.png");
        } else if (COBBLE_CONFIG.dugtrioSkin.equals("alolan") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "alolan.png");
        } else {
            return Utils.cobble(id + "alolan_shiny.png");
        }
    }

    @Override
    public @NotNull Identifier getAnimationResource(Dugtrio animatable) {
        return Utils.cobble("dugtrio");
    }
}
