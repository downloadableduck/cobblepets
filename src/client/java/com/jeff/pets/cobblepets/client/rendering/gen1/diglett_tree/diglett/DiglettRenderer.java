package com.jeff.pets.cobblepets.client.rendering.gen1.diglett_tree.diglett;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.diglett.Diglett;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class DiglettRenderer extends CobbleRenderer<Diglett> {
    public DiglettRenderer(EntityRendererProvider.Context context) {
        super(context, new DiglettModel());
    }
}
