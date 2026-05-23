package com.jeff.pets.cobblepets.client.rendering.gen1.mankey_tree.mankey;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.mankey.Mankey;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MankeyRenderer extends CobbleRenderer<Mankey> {
    public MankeyRenderer(EntityRendererProvider.Context context) {
        super(context, new MankeyModel());
    }
}
