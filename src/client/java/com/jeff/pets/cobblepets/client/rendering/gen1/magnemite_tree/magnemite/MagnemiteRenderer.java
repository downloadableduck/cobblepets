package com.jeff.pets.cobblepets.client.rendering.gen1.magnemite_tree.magnemite;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.magnamite.Magnemite;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MagnemiteRenderer extends CobbleRenderer<Magnemite> {
    public MagnemiteRenderer(EntityRendererProvider.Context context) {
        super(context, new MagnemiteModel());
    }
}
