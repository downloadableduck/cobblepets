package com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.arbok;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.ekans.Arbok;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class ArbokRenderer extends CobbleRenderer<Arbok, LivingEntityRenderState> {
    public ArbokRenderer(EntityRendererProvider.Context context) {
        super(context, new ArbokModel());
    }
}
