package com.jeff.pets.cobblepets.client.rendering.gen1.cubone_tree.marowak;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.cubone.Marowak;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MarowakRenderer extends CobbleRenderer<Marowak> {
    public MarowakRenderer(EntityRendererProvider.Context context) {
        super(context, new MarowakModel());
    }
}
