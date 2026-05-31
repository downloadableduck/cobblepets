package com.jeff.pets.cobblepets.client.rendering.gen5.snivy_tree.serperior;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Serperior;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class SerperiorRenderer extends CobbleRenderer<Serperior> {
    public SerperiorRenderer(EntityRendererProvider.Context context) {
        super(context, new SerperiorModel());
    }
}
