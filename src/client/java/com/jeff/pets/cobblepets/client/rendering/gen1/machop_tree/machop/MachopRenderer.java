package com.jeff.pets.cobblepets.client.rendering.gen1.machop_tree.machop;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machop;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MachopRenderer extends CobbleRenderer<Machop> {
    public MachopRenderer(EntityRendererProvider.Context context) {
        super(context, new MachopModel());
    }
}
