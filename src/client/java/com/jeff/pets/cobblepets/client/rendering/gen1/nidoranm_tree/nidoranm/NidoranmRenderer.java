package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranm_tree.nidoranm;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidoranm;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class NidoranmRenderer extends CobbleRenderer<Nidoranm> {
    public NidoranmRenderer(EntityRendererProvider.Context context) {
        super(context, new NidoranmModel());
    }
}
