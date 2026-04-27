package com.jeff.pets.cobblepets.client.rendering.charmander_tree.charmeleon;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.charmander.Charmeleon;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class CharmeleonRenderer extends CobbleRenderer<Charmeleon, LivingEntityRenderState> {
    public CharmeleonRenderer(EntityRendererProvider.Context context) {
        super(context, new CharmeleonModel());
    }
}
