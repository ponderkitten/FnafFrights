package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.ToyFreddyShowtimeActiveBlockModel;
import net.mcreator.fnaffrights.block.entity.ToyFreddyShowtimeActiveTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToyFreddyShowtimeActiveTileRenderer extends GeoBlockRenderer<ToyFreddyShowtimeActiveTileEntity> {
	public ToyFreddyShowtimeActiveTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new ToyFreddyShowtimeActiveBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyShowtimeActiveTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
