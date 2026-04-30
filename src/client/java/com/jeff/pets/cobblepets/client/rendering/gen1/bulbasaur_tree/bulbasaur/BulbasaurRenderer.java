package com.jeff.pets.cobblepets.client.rendering.gen1.bulbasaur_tree.bulbasaur;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Bulbasaur;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class BulbasaurRenderer extends CobbleRenderer<@NotNull Bulbasaur> {

    public BulbasaurRenderer(EntityRendererProvider.Context context) {
        super(context, new BulbasaurModel());
    }
}
