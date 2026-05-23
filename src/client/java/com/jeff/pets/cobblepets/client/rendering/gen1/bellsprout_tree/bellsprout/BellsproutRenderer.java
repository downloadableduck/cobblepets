package com.jeff.pets.cobblepets.client.rendering.gen1.bellsprout_tree.bellsprout;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Bellsprout;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class BellsproutRenderer extends CobbleRenderer<Bellsprout> {
    public BellsproutRenderer(EntityRendererProvider.Context context) {
        super(context, new BellsproutModel());
    }
}
