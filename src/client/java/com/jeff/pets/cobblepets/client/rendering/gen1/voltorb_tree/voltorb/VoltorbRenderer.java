package com.jeff.pets.cobblepets.client.rendering.gen1.voltorb_tree.voltorb;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Voltorb;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class VoltorbRenderer extends CobbleRenderer<Voltorb> {
    public VoltorbRenderer(EntityRendererProvider.Context context) {
        super(context, new VoltorbModel());
    }
}
