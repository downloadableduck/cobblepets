package com.jeff.pets.cobblepets.client.rendering.gen1.slowpoke_tree.slowbro;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowbro;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class SlowbroRenderer extends CobbleRenderer<Slowbro> {
    public SlowbroRenderer(EntityRendererProvider.Context context) {
        super(context, new SlowbroModel());
    }
}
