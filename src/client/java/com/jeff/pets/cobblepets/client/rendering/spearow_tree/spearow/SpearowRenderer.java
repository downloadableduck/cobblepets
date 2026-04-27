package com.jeff.pets.cobblepets.client.rendering.spearow_tree.spearow;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.spearow.Spearow;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class SpearowRenderer extends CobbleRenderer<Spearow, LivingEntityRenderState> {
    public SpearowRenderer(EntityRendererProvider.Context context) {
        super(context, new SpearowModel());
    }
}
