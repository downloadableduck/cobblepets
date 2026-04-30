package com.jeff.pets.cobblepets.client.rendering.gen1.zubat_tree.zubat;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.zubat.Zubat;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class ZubatRenderer extends CobbleRenderer<Zubat> {
    public ZubatRenderer(EntityRendererProvider.Context context) {
        super(context, new ZubatModel());
    }
}
