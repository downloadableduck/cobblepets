package com.jeff.pets.cobblepets.client.rendering.gen1.cubone_tree.cubone;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.cubone.Cubone;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class CuboneRenderer extends CobbleRenderer<Cubone> {
    public CuboneRenderer(EntityRendererProvider.Context context) {
        super(context, new CuboneModel());
    }
}
