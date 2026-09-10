package com.jeff.pets.cobblepets.client.rendering.gen1.voltorb_tree.electrode;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Electrode;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Voltorb;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ElectrodeModel extends GeoModel<Electrode> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        return COBBLE_CONFIG.electrodeSkin.equals("hisuian") ? Utils.cobble("electrode_hisuian") : Utils.cobble("electrode");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Electrode animateable) {
        return Utils.cobble("electrode");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.electrodeSkin, "textures/entity/voltorb-tree/electrode/", "electrode");
    }
}
