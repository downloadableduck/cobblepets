package com.jeff.pets.nyancat.client;

import com.jeff.pets.rendering.custom.first.racoon.RacoonRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

public class NyanCatModel extends EntityModel<@NotNull RacoonRenderState> {

    private final ModelPart body;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftFrontLeg;
    private final ModelPart rightHindLeg;
    private final ModelPart leftHindLeg;

    public NyanCatModel(ModelPart root) {
        super(root);
        this.body = root.getChild("body");
        this.rightFrontLeg = root.getChild("right_front_leg");
        this.leftFrontLeg = root.getChild("left_front_leg");
        this.rightHindLeg = root.getChild("right_hind_leg");
        this.leftHindLeg = root.getChild("left_hind_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 7).addBox(1.0F, -20.0F, 0.0F, 32.0F, 18.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 7).addBox(1.0F, -20.0F, 0.0F, 32.0F, 18.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(0.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, 24.0F, 0.0F));

        PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(11.0F, 22.0F, 0.0F));

        PartDefinition right_front_leg_r1 = right_front_leg.addOrReplaceChild("right_front_leg_r1", CubeListBuilder.create().texOffs(20, 25).addBox(-3.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(5.0F, 22.0F, 0.0F));

        PartDefinition left_front_leg_r1 = left_front_leg.addOrReplaceChild("left_front_leg_r1", CubeListBuilder.create().texOffs(13, 25).addBox(-3.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(9, 25).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 22.0F, 0.0F));

        PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(-8.0F, 22.0F, 0.0F));

        PartDefinition left_hind_leg_r1 = left_hind_leg.addOrReplaceChild("left_hind_leg_r1", CubeListBuilder.create().texOffs(9, 25).addBox(-3.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(RacoonRenderState state) {
        super.setupAnim(state);
        float animSpeed = state.walkAnimationSpeed;
        float animPos = state.walkAnimationPos;
        this.rightFrontLeg.xRot = Mth.cos(animPos * 0.6662F + (float) Math.PI) * 1.4F * animSpeed;
        this.leftFrontLeg.xRot = Mth.cos(animPos * 0.6662F) * 1.4F * animSpeed;
        this.rightHindLeg.xRot = Mth.cos(animPos * 0.6662F + (float) Math.PI) * 1.4F * animSpeed;
        this.leftHindLeg.xRot = Mth.cos(animPos * 0.6662F) * 1.4F * animSpeed;
        this.rightHindLeg.visible = true;
        this.leftHindLeg.visible = true;
        this.rightFrontLeg.visible = true;
        this.leftFrontLeg.visible = true;
        if (state.isPassenger) {
            ModelPart var10000 = this.root;
            var10000.z -= 2.0F;
            this.body.xRot = 1.3089969F;
            ModelPart modelPart = this.body;
            modelPart.y -= 7.0F * animPos;
            modelPart.z += 3.0F * animPos;
            modelPart.z -= animPos + 1.0F;
            modelPart.y += 3.0F;
            modelPart.xRot -= -45.0F;
            --this.rightHindLeg.xRot;
            modelPart = this.rightHindLeg;
            modelPart.y += 4.0F;
            modelPart.z -= 0.25F * animPos;
            --this.leftHindLeg.xRot;
            modelPart = this.leftHindLeg;
            modelPart.y += 4.0F;
            modelPart.z -= 0.25F * animPos;
            this.rightFrontLeg.xRot = -0.2617994F;
            this.leftFrontLeg.xRot = -0.2617994F;
        }
    }
}