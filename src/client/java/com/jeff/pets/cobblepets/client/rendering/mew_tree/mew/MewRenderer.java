package com.jeff.pets.cobblepets.client.rendering.mew_tree.mew;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.mew.Mew;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class MewRenderer extends CobbleRenderer<Mew, LivingEntityRenderState> {
    public MewRenderer(EntityRendererProvider.Context context) {
        super(context, new MewModel());
    }
}
