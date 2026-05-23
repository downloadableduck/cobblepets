package com.jeff.pets.cobblepets.client.rendering.gen1.poliwag_tree.poliwag;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwag;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class PoliwagRenderer extends CobbleRenderer<Poliwag> {
    public PoliwagRenderer(EntityRendererProvider.Context context) {
        super(context, new PoliwagModel());
    }
}
