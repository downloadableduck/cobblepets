package com.jeff.pets.cobblepets.client.rendering.gen1.mankey_tree.primeape;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.mankey.Primeape;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class PrimeapeRenderer extends CobbleRenderer<Primeape> {
    public PrimeapeRenderer(EntityRendererProvider.Context context) {
        super(context, new PrimeapeModel());
    }
}
