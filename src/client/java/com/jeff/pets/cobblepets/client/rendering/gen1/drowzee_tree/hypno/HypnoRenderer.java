package com.jeff.pets.cobblepets.client.rendering.gen1.drowzee_tree.hypno;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.drowzee.Hypno;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class HypnoRenderer extends CobbleRenderer<Hypno> {
    public HypnoRenderer(EntityRendererProvider.Context context) {
        super(context, new HypnoModel());
    }
}
