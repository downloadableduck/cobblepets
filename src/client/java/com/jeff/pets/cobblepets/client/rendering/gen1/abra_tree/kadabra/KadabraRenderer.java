package com.jeff.pets.cobblepets.client.rendering.gen1.abra_tree.kadabra;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.abra.Kadabra;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class KadabraRenderer extends CobbleRenderer<Kadabra> {
    public KadabraRenderer(EntityRendererProvider.Context context) {
        super(context, new KadabraModel());
    }
}
