package com.jeff.pets.cobblepets.client.rendering.gen4.riolu_tree.riolu;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Riolu;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RioluRenderer extends CobbleRenderer<Riolu> {
    public RioluRenderer(EntityRendererProvider.Context context) {
        super(context, new RioluModel());
    }
}
