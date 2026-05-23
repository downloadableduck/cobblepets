package com.jeff.pets.cobblepets.client.rendering.gen1.geodude_tree.golem;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Golem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GolemRenderer extends CobbleRenderer<Golem> {
    public GolemRenderer(EntityRendererProvider.Context context) {
        super(context, new GolemModel());
    }
}
