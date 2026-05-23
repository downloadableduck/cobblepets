package com.jeff.pets.cobblepets.client.rendering.gen1.poliwag_tree.poliwrath;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwrath;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class PoliwrathRenderer extends CobbleRenderer<Poliwrath> {
    public PoliwrathRenderer(EntityRendererProvider.Context context) {
        super(context, new PoliwrathModel());
    }
}
