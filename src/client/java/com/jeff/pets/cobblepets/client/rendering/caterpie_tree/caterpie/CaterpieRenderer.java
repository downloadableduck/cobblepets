package com.jeff.pets.cobblepets.client.rendering.caterpie_tree.caterpie;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.caterpie.Caterpie;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class CaterpieRenderer extends CobbleRenderer<Caterpie, LivingEntityRenderState> {
    public CaterpieRenderer(EntityRendererProvider.Context context) {
        super(context, new CaterpieModel());
    }
}
