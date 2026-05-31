package com.jeff.pets.cobblepets.client.rendering.gen4.riolu_tree.lucario;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.GeoModel;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Lucario;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class LucarioModel extends GeoModel<Lucario> {
    @Override
    public String resourceLocation() {
        return "lucario";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState geoRenderState) {
        return Utils.getSkin("textures/entity/gen4/riolu-tree/lucario/", "lucario");
    }
}
