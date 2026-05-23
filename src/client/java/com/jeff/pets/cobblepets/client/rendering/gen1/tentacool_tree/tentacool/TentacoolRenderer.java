package com.jeff.pets.cobblepets.client.rendering.gen1.tentacool_tree.tentacool;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.tentacool.Tentacool;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class TentacoolRenderer extends CobbleRenderer<Tentacool> {
    public TentacoolRenderer(EntityRendererProvider.Context context) {
        super(context, new TentacoolModel());
    }
}
