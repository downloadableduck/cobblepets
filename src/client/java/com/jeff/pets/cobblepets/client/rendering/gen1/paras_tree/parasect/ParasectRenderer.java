package com.jeff.pets.cobblepets.client.rendering.gen1.paras_tree.parasect;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.paras.Parasect;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class ParasectRenderer extends CobbleRenderer<Parasect> {
    public ParasectRenderer(EntityRendererProvider.Context context) {
        super(context, new ParasectModel());
    }
}
