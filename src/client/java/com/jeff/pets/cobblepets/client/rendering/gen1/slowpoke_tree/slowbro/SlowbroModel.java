package com.jeff.pets.cobblepets.client.rendering.gen1.slowpoke_tree.slowbro;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowbro;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class SlowbroModel extends GeoModel<Slowbro> {
    @Override
    public String resourceLocation() {
        return null;
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState state) {
        return COBBLE_CONFIG.slowbroSkin.equals("galarian") ? Utils.cobble("slowbro_galarian") : Utils.cobble("slowbro");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Slowbro animateable) {
        return this.getModelResource(null);
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        String base = "textures/entity/slowpoke-tree/slowbro/";
        return Utils.getSkin(COBBLE_CONFIG.slowbroSkin, base, "slowbro");
    }
}
