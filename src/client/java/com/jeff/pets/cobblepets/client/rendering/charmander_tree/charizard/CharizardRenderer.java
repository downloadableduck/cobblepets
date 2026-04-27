package com.jeff.pets.cobblepets.client.rendering.charmander_tree.charizard;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.charmander.Charizard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class CharizardRenderer extends CobbleRenderer<Charizard, LivingEntityRenderState> {
    public CharizardRenderer(EntityRendererProvider.Context context) {
        super(context, new CharizardModel());
    }
}
