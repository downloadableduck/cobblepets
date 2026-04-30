package com.jeff.pets.cobblepets.client.rendering.gen1.zubat_tree.golbat;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.zubat.Golbat;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class GolbatRenderer extends CobbleRenderer<Golbat> {
    public GolbatRenderer(EntityRendererProvider.Context context) {
        super(context, new GolbatModel());
    }
}
