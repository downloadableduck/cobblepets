package com.jeff.pets.cobblepets.client.rendering.gen1.tentacool_tree.tentacruel;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.tentacool.Tentacruel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class TentacruelRenderer extends CobbleRenderer<Tentacruel> {
    public TentacruelRenderer(EntityRendererProvider.Context context) {
        super(context, new TentacruelModel());
    }
}
