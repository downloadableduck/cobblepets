package com.jeff.pets.cobblepets.client.rendering.gen1.psyduck_tree.golduck;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.psyduck.Golduck;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GolduckRenderer extends CobbleRenderer<Golduck> {
    public GolduckRenderer(EntityRendererProvider.Context context) {
        super(context, new GolduckModel());
    }
}
