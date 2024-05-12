package net.mcreator.fnaffrights.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Modelmarie_body<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fredinanightclub", "modelmarie_body"), "main");
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;

	public Modelmarie_body(ModelPart root) {
		this.LeftArm = root.m_171324_("LeftArm");
		this.RightArm = root.m_171324_("RightArm");
		this.Body = root.m_171324_("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.m_171576_();
		PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_(), PartPose.m_171423_(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r1 = LeftArm.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(32, 56).m_171480_().m_171488_(-1.5F, 0.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).m_171555_(false),
				PartPose.m_171423_(-1.0F, -1.0F, 0.0F, 0.0F, -0.0436F, -0.0873F));
		PartDefinition shoulder_r1 = LeftArm.m_171599_("shoulder_r1", CubeListBuilder.m_171558_().m_171514_(59, 48).m_171480_().m_171488_(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false),
				PartPose.m_171423_(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition l_forearm = LeftArm.m_171599_("l_forearm", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 3.0F, 0.0F));
		PartDefinition hand_r1 = l_forearm.m_171599_("hand_r1", CubeListBuilder.m_171558_().m_171514_(12, 60).m_171480_().m_171488_(-1.0F, 0.7F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false),
				PartPose.m_171423_(0.0F, 3.0F, 0.0F, -0.0873F, -0.0873F, 0.0F));
		PartDefinition cube_r2 = l_forearm.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(56, 58).m_171480_().m_171488_(-1.5F, 1.8F, -1.58F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).m_171555_(false),
				PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.1309F, -0.1745F, -0.1309F));
		PartDefinition elbow_r1 = l_forearm.m_171599_("elbow_r1", CubeListBuilder.m_171558_().m_171514_(33, 63).m_171480_().m_171488_(-1.5F, 0.2F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).m_171555_(false),
				PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.1309F, -0.1745F, -0.0873F));
		PartDefinition RightArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_(), PartPose.m_171423_(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r3 = RightArm.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(32, 56).m_171488_(-1.5F, 0.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(1.0F, -1.0F, 0.0F, 0.0F, 0.0436F, 0.0873F));
		PartDefinition shoulder_r2 = RightArm.m_171599_("shoulder_r2", CubeListBuilder.m_171558_().m_171514_(59, 48).m_171488_(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.m_171423_(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition r_forearm = RightArm.m_171599_("r_forearm", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 3.0F, 0.0F));
		PartDefinition hand_r2 = r_forearm.m_171599_("hand_r2", CubeListBuilder.m_171558_().m_171514_(12, 60).m_171488_(-2.0F, 0.7F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 3.0F, 0.0F, -0.0873F, 0.0873F, 0.0F));
		PartDefinition cube_r4 = r_forearm.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(56, 58).m_171488_(-1.5F, 1.8F, -1.58F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.1309F, 0.1745F, 0.1309F));
		PartDefinition elbow_r2 = r_forearm.m_171599_("elbow_r2", CubeListBuilder.m_171558_().m_171514_(33, 63).m_171488_(-1.5F, 0.2F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.1309F, 0.1745F, 0.0873F));
		PartDefinition Body = partdefinition.m_171599_("Body",
				CubeListBuilder.m_171558_().m_171514_(34, 37).m_171488_(-4.0F, 8.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 36).m_171488_(-3.0F, 5.0F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(19, 32)
						.m_171488_(-2.0F, 5.0F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(11, 33).m_171488_(-1.5F, 6.0F, -3.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.5F)).m_171514_(0, 0)
						.m_171488_(-1.0F, 8.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.m_171419_(0.0F, 0.0F, 0.0F));
		PartDefinition buttons_r1 = Body.m_171599_("buttons_r1", CubeListBuilder.m_171558_().m_171514_(21, 4).m_171488_(-1.5F, 0.0F, -6.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition neck_r1 = Body.m_171599_("neck_r1", CubeListBuilder.m_171558_().m_171514_(0, 60).m_171488_(-1.5F, -2.3F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition spine_r1 = Body.m_171599_("spine_r1", CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-3.5F, -23.7F, -5.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(0.0F, 24.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Body.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(0, 2).m_171488_(-1.0F, -3.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.m_171599_("Body_r1", CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-3.5F, -3.0F, -2.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 3.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition booba = Body.m_171599_("booba", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
		PartDefinition boob_l_r1 = booba.m_171599_("boob_l_r1", CubeListBuilder.m_171558_().m_171514_(34, 29).m_171480_().m_171488_(1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.31F)).m_171555_(false),
				PartPose.m_171423_(0.0F, 3.0F, -1.0F, 0.5236F, -0.4363F, 0.0F));
		PartDefinition boob_l_r2 = booba.m_171599_("boob_l_r2", CubeListBuilder.m_171558_().m_171514_(20, 25).m_171480_().m_171488_(0.0F, -1.5F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)).m_171555_(false),
				PartPose.m_171423_(0.0F, 3.0F, -1.0F, 0.5236F, -0.2618F, 0.0F));
		PartDefinition boob_r_r1 = booba.m_171599_("boob_r_r1", CubeListBuilder.m_171558_().m_171514_(34, 29).m_171488_(-3.0F, -1.5F, -4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.31F)),
				PartPose.m_171423_(0.0F, 3.0F, -1.0F, 0.5236F, 0.4363F, 0.0F));
		PartDefinition boob_l_r3 = booba.m_171599_("boob_l_r3", CubeListBuilder.m_171558_().m_171514_(12, 43).m_171480_().m_171488_(0.0F, -1.5F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false),
				PartPose.m_171423_(0.0F, 3.0F, -1.0F, -0.3491F, -0.1745F, 0.0F));
		PartDefinition boob_r_r2 = booba.m_171599_("boob_r_r2", CubeListBuilder.m_171558_().m_171514_(12, 43).m_171488_(-3.0F, -1.5F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.m_171423_(0.0F, 3.0F, -1.0F, -0.3491F, 0.1745F, 0.0F));
		PartDefinition boob_r_r3 = booba.m_171599_("boob_r_r3", CubeListBuilder.m_171558_().m_171514_(20, 25).m_171488_(-3.0F, -1.5F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171423_(0.0F, 3.0F, -1.0F, 0.5236F, 0.2618F, 0.0F));
		return LayerDefinition.m_171565_(meshdefinition, 128, 128);
	}

	public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
