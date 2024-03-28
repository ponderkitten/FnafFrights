package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.WitheredBonnieRightLegBlockModel;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieRightLegTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredBonnieRightLegTileRenderer extends GeoBlockRenderer<WitheredBonnieRightLegTileEntity> {
	public WitheredBonnieRightLegTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new WitheredBonnieRightLegBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredBonnieRightLegTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
