package com.jeff.pets.cobblepets.client.rendering.gen1.seel_tree.seel;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.seel.Seel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

import java.lang.classfile.Signature;

public class SeelRenderer extends CobbleRenderer<Seel> {
    public SeelRenderer(EntityRendererProvider.Context context) {
        super(context, new SeelModel());
    }
}
