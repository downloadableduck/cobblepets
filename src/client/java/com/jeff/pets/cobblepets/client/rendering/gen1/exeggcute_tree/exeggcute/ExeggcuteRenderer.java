package com.jeff.pets.cobblepets.client.rendering.gen1.exeggcute_tree.exeggcute;

import com.geckolib.model.GeoModel;
import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggcute;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ExeggcuteRenderer extends CobbleRenderer<Exeggcute> {
    public ExeggcuteRenderer(EntityRendererProvider.Context context) {
        super(context, new ExeggcuteModel());
    }
}
