package com.jeff.pets.cobblepets.client.rendering.gen1.voltorb_tree.electrode;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Electrode;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ElectrodeRenderer extends CobbleRenderer<Electrode> {
    public ElectrodeRenderer(EntityRendererProvider.Context context) {
        super(context, new ElectrodeModel());
    }
}
