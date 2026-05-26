package com.jeff.pets.cobblepets.client.rendering.gen1.doduo_tree.doduo;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.doduo.Doduo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class DoduoRenderer extends CobbleRenderer<Doduo> {
    public DoduoRenderer(EntityRendererProvider.Context context) {
        super(context, new DoduoModel());
    }
}
