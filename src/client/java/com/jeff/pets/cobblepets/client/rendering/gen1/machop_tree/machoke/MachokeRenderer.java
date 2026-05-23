package com.jeff.pets.cobblepets.client.rendering.gen1.machop_tree.machoke;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machoke;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MachokeRenderer extends CobbleRenderer<Machoke> {
    public MachokeRenderer(EntityRendererProvider.Context context) {
        super(context, new MachokeModel());
    }
}
