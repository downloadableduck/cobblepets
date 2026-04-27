package com.jeff.pets.cobblepets.client.rendering.spearow_tree.fearow;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.spearow.Fearow;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class FearowRenderer extends CobbleRenderer<Fearow, LivingEntityRenderState> {
    public FearowRenderer(EntityRendererProvider.Context context) {
        super(context, new FearowModel());
    }
}
