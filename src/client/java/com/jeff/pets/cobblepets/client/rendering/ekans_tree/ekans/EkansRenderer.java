package com.jeff.pets.cobblepets.client.rendering.ekans_tree.ekans;

import com.jeff.pets.cobblepets.client.rendering.CobbleRenderer;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import com.jeff.pets.cobblepets.pets.ekans.Ekans;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class EkansRenderer extends CobbleRenderer<Ekans, LivingEntityRenderState> {
    public EkansRenderer(EntityRendererProvider.Context context) {
        super(context, new EkansModel());
    }
}
