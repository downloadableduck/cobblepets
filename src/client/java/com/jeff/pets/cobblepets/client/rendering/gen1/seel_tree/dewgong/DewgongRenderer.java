package com.jeff.pets.cobblepets.client.rendering.gen1.seel_tree.dewgong;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.seel.Dewgong;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class DewgongRenderer extends CobbleRenderer<Dewgong> {
    public DewgongRenderer(EntityRendererProvider.Context context) {
        super(context, new DewgongModel());
    }
}
