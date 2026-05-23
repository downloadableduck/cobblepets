package com.jeff.pets.cobblepets.client.rendering.gen1.ponyta_tree.rapidash;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.ponyta.Rapidash;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RapidashRenderer extends CobbleRenderer<Rapidash> {
    public RapidashRenderer(EntityRendererProvider.Context context) {
        super(context, new RapidashModel());
    }
}
