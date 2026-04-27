package com.jeff.pets.cobblepets.client.rendering.charmander_tree.charmander;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.charmander.Charmander;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class CharmanderRenderer extends CobbleRenderer<Charmander, LivingEntityRenderState> {
    public CharmanderRenderer(EntityRendererProvider.Context context) {
        super(context, new CharmanderModel());
    }
}
