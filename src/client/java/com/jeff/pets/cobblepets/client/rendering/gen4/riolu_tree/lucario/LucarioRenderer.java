package com.jeff.pets.cobblepets.client.rendering.gen4.riolu_tree.lucario;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Lucario;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class LucarioRenderer extends CobbleRenderer<Lucario> {
    public LucarioRenderer(EntityRendererProvider.Context context) {
        super(context, new LucarioModel());
    }
}
