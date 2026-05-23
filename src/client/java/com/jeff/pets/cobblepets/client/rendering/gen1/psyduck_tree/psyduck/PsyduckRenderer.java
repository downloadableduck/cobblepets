package com.jeff.pets.cobblepets.client.rendering.gen1.psyduck_tree.psyduck;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.psyduck.Psyduck;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PsyduckRenderer extends CobbleRenderer<Psyduck> {
    public PsyduckRenderer(EntityRendererProvider.Context context) {
        super(context, new PsyduckModel());
    }
}
