package com.jeff.pets.cobblepets.client.rendering.gen1.diglett_tree.dugtrio;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.diglett.Dugtrio;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class DugtrioRenderer extends CobbleRenderer<Dugtrio> {
    public DugtrioRenderer(EntityRendererProvider.Context context) {
        super(context, new DugtrioModel());
    }
}
