package com.jeff.pets.cobblepets.client.rendering.gen1.abra_tree.abra;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.abra.Abra;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class AbraRenderer extends CobbleRenderer<Abra> {
    public AbraRenderer(EntityRendererProvider.Context context) {
        super(context, new AbraModel());
    }
}
