package com.jeff.pets.cobblepets.client.rendering.gen1.mew_tree.mewtwo;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mewtwo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class MewtwoRenderer extends CobbleRenderer<Mewtwo, LivingEntityRenderState> {
    public MewtwoRenderer(EntityRendererProvider.Context context) {
        super(context, new MewtwoModel());
    }
}
