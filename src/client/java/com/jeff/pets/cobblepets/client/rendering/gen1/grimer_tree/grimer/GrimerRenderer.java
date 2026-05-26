package com.jeff.pets.cobblepets.client.rendering.gen1.grimer_tree.grimer;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Grimer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GrimerRenderer extends CobbleRenderer<Grimer> {
    public GrimerRenderer(EntityRendererProvider.Context context) {
        super(context, new GrimerModel());
    }
}
