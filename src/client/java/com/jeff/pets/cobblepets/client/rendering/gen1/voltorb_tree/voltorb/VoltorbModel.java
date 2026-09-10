package com.jeff.pets.cobblepets.client.rendering.gen1.voltorb_tree.voltorb;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Voltorb;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class VoltorbModel extends GeoModel<Voltorb> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        return COBBLE_CONFIG.voltorbSkin.equals("hisuian") ? Utils.cobble("voltorb_hisuian") : Utils.cobble("voltorb");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Voltorb animateable) {
        return Utils.cobble("voltorb");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.voltorbSkin, "textures/entity/voltorb-tree/voltorb/", "voltorb");
    }
}
