package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.SpringBonnieBunnieRightLegBlockModel;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieRightLegTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpringBonnieBunnieRightLegTileRenderer extends GeoBlockRenderer<SpringBonnieBunnieRightLegTileEntity> {
	public SpringBonnieBunnieRightLegTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new SpringBonnieBunnieRightLegBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieBunnieRightLegTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
