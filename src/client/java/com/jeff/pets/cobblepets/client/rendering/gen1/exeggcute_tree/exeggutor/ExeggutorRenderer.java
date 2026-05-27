package com.jeff.pets.cobblepets.client.rendering.gen1.exeggcute_tree.exeggutor;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggutor;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ExeggutorRenderer extends CobbleRenderer<Exeggutor> {
    public ExeggutorRenderer(EntityRendererProvider.Context context) {
        super(context, new ExeggutorModel());
    }
}
