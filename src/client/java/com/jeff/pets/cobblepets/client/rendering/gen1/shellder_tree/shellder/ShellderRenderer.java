package com.jeff.pets.cobblepets.client.rendering.gen1.shellder_tree.shellder;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.shellder.Shellder;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ShellderRenderer extends CobbleRenderer<Shellder> {
    public ShellderRenderer(EntityRendererProvider.Context context) {
        super(context, new ShellderModel());
    }
}
