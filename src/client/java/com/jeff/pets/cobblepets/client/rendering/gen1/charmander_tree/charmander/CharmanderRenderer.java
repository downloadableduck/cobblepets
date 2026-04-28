package com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charmander;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmander;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class CharmanderRenderer extends CobbleRenderer<Charmander, LivingEntityRenderState> {
    public CharmanderRenderer(EntityRendererProvider.Context context) {
        super(context, new CharmanderModel());
    }
}
