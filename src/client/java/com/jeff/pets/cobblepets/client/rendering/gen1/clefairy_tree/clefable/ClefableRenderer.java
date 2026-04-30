package com.jeff.pets.cobblepets.client.rendering.gen1.clefairy_tree.clefable;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.clefairy.Clefable;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class ClefableRenderer extends CobbleRenderer<Clefable> {
    public ClefableRenderer(EntityRendererProvider.Context context) {
        super(context, new ClefableModel());
    }
}
