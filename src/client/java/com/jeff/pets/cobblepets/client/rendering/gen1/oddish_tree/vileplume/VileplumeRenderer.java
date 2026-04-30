package com.jeff.pets.cobblepets.client.rendering.gen1.oddish_tree.vileplume;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Vileplume;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class VileplumeRenderer extends CobbleRenderer<Vileplume> {
    public VileplumeRenderer(EntityRendererProvider.Context context) {
        super(context, new VileplumeModel());
    }
}
