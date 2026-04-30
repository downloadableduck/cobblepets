package com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charmeleon;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmeleon;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class CharmeleonRenderer extends CobbleRenderer<Charmeleon> {
    public CharmeleonRenderer(EntityRendererProvider.Context context) {
        super(context, new CharmeleonModel());
    }
}
