package com.jeff.pets.cobblepets.client.rendering.gen1.farfetchd;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.farfetchd.Farfetchd;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class FarfetchdModel extends GeoModel<Farfetchd> {
    @Override
    public String resourceLocation() {
        return "farfetchd";
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        return COBBLE_CONFIG.farfetchdSkin.equals("galarian") ? Utils.cobble("farfetchd_galarian") : Utils.cobble("farfetchd");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.farfetchdSkin, "textures/entity/farfetchd/", "farfetchd");
    }
}
