package com.jeff.pets.cobblepets.client.rendering.gen1.pikachu_tree.pikachu;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Pikachu;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class PikachuRenderer extends CobbleRenderer<Pikachu, LivingEntityRenderState> {
    public PikachuRenderer(EntityRendererProvider.Context context) {
        super(context, new PikachuModel());
    }
}
