package com.jeff.pets.cobblepets.client.rendering.gen1.cubone_tree.marowak;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.cubone.Marowak;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class MarowakModel extends GeoModel<Marowak> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public Identifier getModelResource(GeoRenderState state) {
        return COBBLE_CONFIG.marowakSkin.equals("normal") ? Utils.cobble("marowak") : Utils.cobble("marowak_alolan");
    }

    @Override
    public Identifier getAnimationResource(Marowak an) {
        return Utils.cobble("marowak");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Utils.getSkin(COBBLE_CONFIG.marowakSkin, "textures/entity/cubone-tree/marowak/", "marowak");
    }
}
