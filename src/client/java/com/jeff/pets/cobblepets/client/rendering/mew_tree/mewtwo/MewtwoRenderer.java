package com.jeff.pets.cobblepets.client.rendering.mew_tree.mewtwo;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.mew.Mewtwo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class MewtwoRenderer extends CobbleRenderer<Mewtwo, LivingEntityRenderState> {
    public MewtwoRenderer(EntityRendererProvider.Context context) {
        super(context, new MewtwoModel());
    }
}
