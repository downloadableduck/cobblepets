package com.jeff.pets.cobblepets.client.rendering.gen1.grimer_tree.muk;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Muk;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MukModel extends GeoModel<Muk> {
    @Override
    public Identifier getAnimationResource(Muk animateable) {
        return Utils.cobble("muk");
    }

    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public Identifier getModelResource(GeoRenderState state) {
        return COBBLE_CONFIG.mukSkin.equals("alolan") ? Utils.cobble("muk_alolan") : Utils.cobble("muk");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.mukSkin, "textures/entity/grimer-tree/muk/", "muk");
    }
}
