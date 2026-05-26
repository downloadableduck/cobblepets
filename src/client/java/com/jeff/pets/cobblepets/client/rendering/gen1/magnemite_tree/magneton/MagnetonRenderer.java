package com.jeff.pets.cobblepets.client.rendering.gen1.magnemite_tree.magneton;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.magnamite.Magneton;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MagnetonRenderer extends CobbleRenderer<Magneton> {
    public MagnetonRenderer(EntityRendererProvider.Context context) {
        super(context, new MagnetonModel());
    }
}
