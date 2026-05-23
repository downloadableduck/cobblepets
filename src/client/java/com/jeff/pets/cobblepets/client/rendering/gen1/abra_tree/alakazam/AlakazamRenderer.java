package com.jeff.pets.cobblepets.client.rendering.gen1.abra_tree.alakazam;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.abra.Alakazam;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class AlakazamRenderer extends CobbleRenderer<Alakazam> {
    public AlakazamRenderer(EntityRendererProvider.Context context) {
        super(context, new AlakazamModel());
    }
}
