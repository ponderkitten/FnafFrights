package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.SpringbonnieShowtimeBlockModel;
import net.mcreator.fnaffrights.block.entity.SpringbonnieShowtimeTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpringbonnieShowtimeTileRenderer extends GeoBlockRenderer<SpringbonnieShowtimeTileEntity> {
	public SpringbonnieShowtimeTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new SpringbonnieShowtimeBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieShowtimeTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
