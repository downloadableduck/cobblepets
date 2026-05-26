package com.jeff.pets.cobblepets.client.rendering.gen1.grimer_tree.grimer;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Grimer;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Muk;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class GrimerModel extends GeoModel<Grimer> {
    @Override
    public Identifier getAnimationResource(@NotNull Grimer animateable) {
        return Utils.cobble("grimer");
    }

    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public Identifier getModelResource(GeoRenderState state) {
        return COBBLE_CONFIG.grimerSkin.equals("alolan") ? Utils.cobble("grimer_alolan") : Utils.cobble("grimer");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.grimerSkin, "textures/entity/grimer-tree/grimer/", "grimer");
    }
}
