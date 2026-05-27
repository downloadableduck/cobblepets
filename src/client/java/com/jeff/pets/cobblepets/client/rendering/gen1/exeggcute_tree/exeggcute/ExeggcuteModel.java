package com.jeff.pets.cobblepets.client.rendering.gen1.exeggcute_tree.exeggcute;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggcute;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Voltorb;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ExeggcuteModel extends GeoModel<Exeggcute> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public Identifier getModelResource(GeoRenderState state) {
        return COBBLE_CONFIG.exeggcuteSkin.equals("alolan") ? Utils.cobble("exeggcute_alolan") : Utils.cobble("exeggcute");
    }

    @Override
    public Identifier getAnimationResource(Exeggcute animateable) {
        return Utils.cobble("exeggcute");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.exeggcuteSkin, "textures/entity/exeggcute-tree/exeggcute/", "exeggcute");
    }
}
