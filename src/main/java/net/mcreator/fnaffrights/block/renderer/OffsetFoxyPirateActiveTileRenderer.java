package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.OffsetFoxyPirateActiveBlockModel;
import net.mcreator.fnaffrights.block.entity.OffsetFoxyPirateActiveTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OffsetFoxyPirateActiveTileRenderer extends GeoBlockRenderer<OffsetFoxyPirateActiveTileEntity> {
	public OffsetFoxyPirateActiveTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new OffsetFoxyPirateActiveBlockModel());
	}

	@Override
	public RenderType getRenderType(OffsetFoxyPirateActiveTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
