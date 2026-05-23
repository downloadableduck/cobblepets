package com.jeff.pets.cobblepets.client.rendering.gen1.bellsprout_tree.victreebel;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Victreebel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class VictreebelRenderer extends CobbleRenderer<Victreebel> {
    public VictreebelRenderer(EntityRendererProvider.Context context) {
        super(context, new VictreebelModel());
    }
}
