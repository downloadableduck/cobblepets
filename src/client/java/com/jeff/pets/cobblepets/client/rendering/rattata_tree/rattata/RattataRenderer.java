package com.jeff.pets.cobblepets.client.rendering.rattata_tree.rattata;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.rattata.Rattata;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import org.jetbrains.annotations.NotNull;

public class RattataRenderer extends CobbleRenderer<Rattata, LivingEntityRenderState> {
    public RattataRenderer(EntityRendererProvider.Context context) {
        super(context, new RattataModel());
    }
}
