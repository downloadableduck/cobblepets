package com.jeff.pets.cobblepets.client.rendering.ekans_tree.arbok;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.ekans.Arbok;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class ArbokRenderer extends CobbleRenderer<Arbok, LivingEntityRenderState> {
    public ArbokRenderer(EntityRendererProvider.Context context) {
        super(context, new ArbokModel());
    }
}
