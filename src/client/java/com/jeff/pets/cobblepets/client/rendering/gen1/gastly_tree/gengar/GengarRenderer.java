package com.jeff.pets.cobblepets.client.rendering.gen1.gastly_tree.gengar;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Gengar;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GengarRenderer extends CobbleRenderer<Gengar> {
    public GengarRenderer(EntityRendererProvider.Context context) {
        super(context, new GengarModel());
    }
}
