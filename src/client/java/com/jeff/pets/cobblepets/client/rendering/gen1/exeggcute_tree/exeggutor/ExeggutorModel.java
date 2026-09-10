package com.jeff.pets.cobblepets.client.rendering.gen1.exeggcute_tree.exeggutor;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggcute;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggutor;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Voltorb;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class ExeggutorModel extends GeoModel<Exeggutor> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        return COBBLE_CONFIG.exeggutorSkin.equals("alolan") ? Utils.cobble("exeggutor_alolan") : Utils.cobble("exeggutor");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Exeggutor animateable) {
        return COBBLE_CONFIG.exeggutorSkin.equals("alolan") ? Utils.cobble("exeggutor_alolan") : Utils.cobble("exeggutor");
    }


    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin(COBBLE_CONFIG.exeggutorSkin, "textures/entity/exeggcute-tree/exeggutor/", "exeggutor");
    }
}
