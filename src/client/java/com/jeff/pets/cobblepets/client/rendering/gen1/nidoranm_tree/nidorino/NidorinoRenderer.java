package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranm_tree.nidorino;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidorino;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class NidorinoRenderer extends CobbleRenderer<Nidorino> {
    public NidorinoRenderer(EntityRendererProvider.Context context) {
        super(context, new NidorinoModel());
    }
}
