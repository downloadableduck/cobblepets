package com.jeff.pets.cobblepets.client.rendering.gen5.snivy_tree.servine;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Servine;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ServineRenderer extends CobbleRenderer<Servine> {
    public ServineRenderer(EntityRendererProvider.Context context) {
        super(context, new ServineModel());
    }
}
