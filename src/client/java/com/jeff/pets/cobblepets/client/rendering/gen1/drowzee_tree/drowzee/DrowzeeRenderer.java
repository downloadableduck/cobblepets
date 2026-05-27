package com.jeff.pets.cobblepets.client.rendering.gen1.drowzee_tree.drowzee;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.drowzee.Drowzee;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class DrowzeeRenderer extends CobbleRenderer<Drowzee> {
    public DrowzeeRenderer(EntityRendererProvider.Context context) {
        super(context, new DrowzeeModel());
    }
}
