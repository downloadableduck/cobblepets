package com.jeff.pets.cobblepets.client.rendering.gen1.oddish_tree.oddish;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Oddish;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class OddishRenderer extends CobbleRenderer<Oddish> {
    public OddishRenderer(EntityRendererProvider.Context context) {
        super(context, new OddishModel());
    }
}
