package com.jeff.pets.cobblepets.client.rendering.gen1.venonat_tree.venomoth;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.venonat.Venomoth;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class VenomothRenderer extends CobbleRenderer<Venomoth> {
    public VenomothRenderer(EntityRendererProvider.Context context) {
        super(context, new VenomothModel());
    }
}
