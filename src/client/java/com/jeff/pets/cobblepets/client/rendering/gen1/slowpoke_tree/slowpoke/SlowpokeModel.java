package com.jeff.pets.cobblepets.client.rendering.gen1.slowpoke_tree.slowpoke;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowbro;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowpoke;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class SlowpokeModel extends GeoModel<Slowpoke> {
    @Override
    public String resourceLocation() {
        return "slowpoke";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        String base = "textures/entity/slowpoke-tree/slowpoke/";
        return Utils.getSkin(COBBLE_CONFIG.slowpokeSkin, base, "slowpoke");
    }
}
