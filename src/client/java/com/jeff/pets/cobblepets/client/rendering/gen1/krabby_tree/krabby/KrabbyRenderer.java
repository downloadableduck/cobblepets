package com.jeff.pets.cobblepets.client.rendering.gen1.krabby_tree.krabby;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.krabby.Krabby;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class KrabbyRenderer extends CobbleRenderer<Krabby> {
    public KrabbyRenderer(EntityRendererProvider.Context context) {
        super(context, new KrabbyModel());
    }
}
