package com.jeff.pets.cobblepets.client.rendering.bulbasaur_tree.bulbasaur;

import com.geckolib.renderer.GeoEntityRenderer;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.bulbasaur.Bulbasaur;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.Cobblepets.MOD_ID;
import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class BulbasaurRenderer extends CobbleRenderer<@NotNull Bulbasaur, @NotNull LivingEntityRenderState> {

    public BulbasaurRenderer(EntityRendererProvider.Context context) {
        super(context, new BulbasaurModel());
    }
}
