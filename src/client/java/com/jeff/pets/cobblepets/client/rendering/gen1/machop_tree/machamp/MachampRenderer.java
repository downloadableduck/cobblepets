package com.jeff.pets.cobblepets.client.rendering.gen1.machop_tree.machamp;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machamp;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MachampRenderer extends CobbleRenderer<Machamp> {
    public MachampRenderer(EntityRendererProvider.Context context) {
        super(context, new MachampModel());
    }
}
