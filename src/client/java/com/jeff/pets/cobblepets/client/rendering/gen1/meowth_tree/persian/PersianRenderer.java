package com.jeff.pets.cobblepets.client.rendering.gen1.meowth_tree.persian;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.meowth.Persian;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class PersianRenderer extends CobbleRenderer<Persian> {
    public PersianRenderer(EntityRendererProvider.Context context) {
        super(context, new PersianModel());
    }
}
