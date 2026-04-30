package com.jeff.pets.cobblepets.client.rendering.gen1.nidoranf_tree.nidoqueen;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoqueen;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class NidoqueenRenderer extends CobbleRenderer<Nidoqueen> {
    public NidoqueenRenderer(EntityRendererProvider.Context context) {
        super(context, new NidoqueenModel());
    }
}
