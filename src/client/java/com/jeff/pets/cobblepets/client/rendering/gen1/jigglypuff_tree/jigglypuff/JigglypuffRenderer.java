package com.jeff.pets.cobblepets.client.rendering.gen1.jigglypuff_tree.jigglypuff;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.jigglypuff.Jigglypuff;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class JigglypuffRenderer extends CobbleRenderer<Jigglypuff> {
    public JigglypuffRenderer(EntityRendererProvider.Context context) {
        super(context, new JigglypuffModel());
    }
}
