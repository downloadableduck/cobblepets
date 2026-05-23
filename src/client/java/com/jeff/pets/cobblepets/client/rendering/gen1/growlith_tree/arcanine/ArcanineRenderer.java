package com.jeff.pets.cobblepets.client.rendering.gen1.growlith_tree.arcanine;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.growlith.Arcanine;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ArcanineRenderer extends CobbleRenderer<Arcanine> {
    public ArcanineRenderer(EntityRendererProvider.Context context) {
        super(context, new ArcanineModel());
    }
}
