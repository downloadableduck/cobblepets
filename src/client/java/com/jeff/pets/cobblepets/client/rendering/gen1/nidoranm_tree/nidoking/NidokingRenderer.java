package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranm_tree.nidoking;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidoking;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class NidokingRenderer extends CobbleRenderer<Nidoking> {
    public NidokingRenderer(EntityRendererProvider.Context context) {
        super(context, new NidokingModel());
    }
}
