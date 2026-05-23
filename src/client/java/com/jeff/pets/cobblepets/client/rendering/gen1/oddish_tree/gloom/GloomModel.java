package com.jeff.pets.cobblepets.client.rendering.gen1.oddish_tree.gloom;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Gloom;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GloomModel extends GeoModel<Gloom> {
    @Override
    public String resourceLocation() {
        return "gloom";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState renderState) {
        String id = "textures/entity/oddish-tree/gloom/";
        if (COBBLE_CONFIG.gloomSkin.equals("normal") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "gloom.png");
        } else if (COBBLE_CONFIG.gloomSkin.equals("normal") && COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "shiny.png");
        } else if (COBBLE_CONFIG.gloomSkin.equals("valencian") && !COBBLE_CONFIG.isShiny) {
            return Utils.cobble(id + "valencian.png");
        } else {
            return Utils.cobble(id + "valencian_shiny.png");
        }
    }
}
