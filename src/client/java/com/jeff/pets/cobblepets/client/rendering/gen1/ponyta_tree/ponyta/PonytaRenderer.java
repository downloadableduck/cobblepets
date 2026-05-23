package com.jeff.pets.cobblepets.client.rendering.gen1.ponyta_tree.ponyta;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.ponyta.Ponyta;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class PonytaRenderer extends CobbleRenderer<Ponyta> {
    public PonytaRenderer(EntityRendererProvider.Context context) {
        super(context, new PonytaModel());
    }
}
