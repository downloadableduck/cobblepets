package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranf_tree.nidorina;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidorina;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class NidorinaRenderer extends CobbleRenderer<Nidorina> {
    public NidorinaRenderer(EntityRendererProvider.Context context) {
        super(context, new NidorinaModel());
    }
}
