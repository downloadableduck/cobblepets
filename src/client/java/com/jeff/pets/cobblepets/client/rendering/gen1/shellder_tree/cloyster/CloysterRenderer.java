package com.jeff.pets.cobblepets.client.rendering.gen1.shellder_tree.cloyster;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.shellder.Cloyster;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class CloysterRenderer extends CobbleRenderer<Cloyster> {
    public CloysterRenderer(EntityRendererProvider.Context context) {
        super(context, new CloysterModel());
    }
}
