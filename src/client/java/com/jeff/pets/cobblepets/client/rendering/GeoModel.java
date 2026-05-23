package com.jeff.pets.cobblepets.client.rendering;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public abstract class GeoModel<T extends GeoAnimatable> extends com.geckolib.model.GeoModel<@NotNull T> {
    public abstract String resourceLocation();

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Utils.cobble(resourceLocation());
    }

    @Override
    public @NotNull Identifier getAnimationResource(T animatable) {
        return Utils.cobble(resourceLocation());
    }
}
