package com.jeff.pets.cobblepets.client.rendering.gen1.magnemite_tree.magneton;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.magnamite.Magneton;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class MagnetonModel extends GeoModel<@NotNull Magneton> {
    @Override
    public String resourceLocation() {
        return "magneton";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/magnemite-tree/magneton/", "magneton");
    }
}
