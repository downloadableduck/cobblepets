package com.jeff.pets.cobblepets.client.rendering.gen1.oddish_tree.vileplume;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Vileplume;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class VileplumeModel extends GeoModel<Vileplume> {
    @Override
    public String resourceLocation() {
        return "vileplume";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/oddish-tree/vileplume/";
        if (COBBLE_CONFIG.vileplumeSkin.equals("normal") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "vileplume.png");
        } else if (COBBLE_CONFIG.vileplumeSkin.equals("normal") && COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "shiny.png");
        } else if (COBBLE_CONFIG.vileplumeSkin.equals("valencian") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "valencian.png");
        } else {
            return Utils.cobble(id + "valencian_shiny.png");
        }
    }
}
