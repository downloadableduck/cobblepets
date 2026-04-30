package com.jeff.pets.cobblepets.client.rendering.gen1.spearow_tree.fearow;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.spearow.Fearow;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class FearowRenderer extends CobbleRenderer<Fearow> {
    public FearowRenderer(EntityRendererProvider.Context context) {
        super(context, new FearowModel());
    }
}
