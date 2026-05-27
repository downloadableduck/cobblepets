package com.jeff.pets.cobblepets.client.rendering.gen1.krabby_tree.kingler;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.krabby.Kingler;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class KinglerRenderer extends CobbleRenderer<Kingler> {
    public KinglerRenderer(EntityRendererProvider.Context context) {
        super(context, new KinglerModel());
    }
}
