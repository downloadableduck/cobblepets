package com.jeff.pets.cobblepets.client.rendering.gen1.poliwag_tree.poliwhirl;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwhirl;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class PoliwhirlRenderer extends CobbleRenderer<Poliwhirl> {
    public PoliwhirlRenderer(EntityRendererProvider.Context context) {
        super(context, new PoliwhirlModel());
    }
}
