package com.jeff.pets.cobblepets.client.rendering.bulbasaur_tree.bulbasaur.ivysaur;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.bulbasaur.Ivysaur;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class IvysaurRenderer extends CobbleRenderer<@NotNull Ivysaur, @NotNull LivingEntityRenderState> {
    public IvysaurRenderer(EntityRendererProvider.Context context) {
        super(context, new IvysaurModel());
    }
}
