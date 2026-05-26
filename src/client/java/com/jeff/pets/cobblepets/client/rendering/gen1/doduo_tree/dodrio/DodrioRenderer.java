package com.jeff.pets.cobblepets.client.rendering.gen1.doduo_tree.dodrio;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.doduo.Dodrio;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class DodrioRenderer extends CobbleRenderer<Dodrio> {
    public DodrioRenderer(EntityRendererProvider.Context context) {
        super(context, new DodrioModel());
    }
}
