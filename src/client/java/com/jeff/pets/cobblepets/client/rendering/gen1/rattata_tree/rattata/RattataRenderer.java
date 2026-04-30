package com.jeff.pets.cobblepets.client.rendering.gen1.rattata_tree.rattata;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Rattata;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class RattataRenderer extends CobbleRenderer<Rattata> {
    public RattataRenderer(EntityRendererProvider.Context context) {
        super(context, new RattataModel());
    }
}
