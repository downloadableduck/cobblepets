package com.jeff.pets.cobblepets.client.rendering.gen1.vulpix_tree.vulpix;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.vulpix.Vulpix;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class VulpixRenderer extends CobbleRenderer<Vulpix> {
    public VulpixRenderer(EntityRendererProvider.Context context) {
        super(context, new VulpixModel());
    }
}
