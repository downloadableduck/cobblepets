package com.jeff.pets.cobblepets.client.rendering.gen5.snivy_tree.snivy;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Snivy;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class SnivyRenderer extends CobbleRenderer<Snivy> {
    public SnivyRenderer(EntityRendererProvider.Context context) {
        super(context, new SnivyModel());
    }
}
