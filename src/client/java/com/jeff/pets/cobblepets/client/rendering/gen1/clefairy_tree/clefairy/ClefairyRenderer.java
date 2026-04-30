package com.jeff.pets.cobblepets.client.rendering.gen1.clefairy_tree.clefairy;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.clefairy.Clefairy;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class ClefairyRenderer extends CobbleRenderer<Clefairy> {
    public ClefairyRenderer(EntityRendererProvider.Context context) {
        super(context, new ClefairyModel());
    }
}
