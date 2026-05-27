package com.jeff.pets.cobblepets.client.rendering.gen1.onix_tree.onix;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.onix.Onix;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class OnixRenderer extends CobbleRenderer<Onix> {
    public OnixRenderer(EntityRendererProvider.Context context) {
        super(context, new OnixModel());
    }
}
