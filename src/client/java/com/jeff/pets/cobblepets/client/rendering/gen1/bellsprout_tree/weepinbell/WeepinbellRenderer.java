package com.jeff.pets.cobblepets.client.rendering.gen1.bellsprout_tree.weepinbell;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Weepinbell;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class WeepinbellRenderer extends CobbleRenderer<Weepinbell> {
    public WeepinbellRenderer(EntityRendererProvider.Context context) {
        super(context, new WeepinbellModel());
    }
}
