package com.jeff.pets.cobblepets.client.rendering.gen1.slowpoke_tree.slowpoke;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowpoke;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SlowpokeRenderer extends CobbleRenderer<Slowpoke> {
    public SlowpokeRenderer(EntityRendererProvider.Context context) {
        super(context, new SlowpokeModel());
    }
}
