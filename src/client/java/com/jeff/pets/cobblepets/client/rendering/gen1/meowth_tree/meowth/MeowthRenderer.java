package com.jeff.pets.cobblepets.client.rendering.gen1.meowth_tree.meowth;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.meowth.Meowth;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MeowthRenderer extends CobbleRenderer<Meowth> {
    public MeowthRenderer(EntityRendererProvider.Context context) {
        super(context, new MeowthModel());
    }
}
