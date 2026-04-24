package com.jeff.pets.nyancat.client;

import com.jeff.pets.nyancat.NyanCat;
import com.jeff.pets.rendering.PetRenderer;
import com.jeff.pets.rendering.custom.first.racoon.RacoonRenderState;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.nyancat.PetsmodNyanCat.MOD_ID;

public class NyanCatRenderer extends PetRenderer<NyanCat, RacoonRenderState, NyanCatModel> {

    public static final ModelLayerLocation NYAN_CAT_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(MOD_ID, "custom_entity"), "main");

    public NyanCatRenderer(EntityRendererProvider.Context context) {
        super(context, new NyanCatModel(context.bakeLayer(NYAN_CAT_LOCATION)), 0.75f);
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull RacoonRenderState state) {
        return Identifier.fromNamespaceAndPath(MOD_ID, "textures/entity/nyan_cat/nyan_cat.png");
    }

    @Override
    public @NotNull RacoonRenderState createRenderState() {
        return new RacoonRenderState();
    }

    @Override
    public void scale(RacoonRenderState state, PoseStack poseStack) {
        super.scale(state, poseStack);
        poseStack.scale(1, 1, 1.1f);
    }
}
