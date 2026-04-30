package com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charizard;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charizard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class CharizardRenderer extends CobbleRenderer<Charizard> {
    public CharizardRenderer(EntityRendererProvider.Context context) {
        super(context, new CharizardModel());
    }
}
