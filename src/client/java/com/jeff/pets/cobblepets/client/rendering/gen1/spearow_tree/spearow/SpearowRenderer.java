package com.jeff.pets.cobblepets.client.rendering.gen1.spearow_tree.spearow;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.spearow.Spearow;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class SpearowRenderer extends CobbleRenderer<Spearow, LivingEntityRenderState> {
    public SpearowRenderer(EntityRendererProvider.Context context) {
        super(context, new SpearowModel());
    }
}
