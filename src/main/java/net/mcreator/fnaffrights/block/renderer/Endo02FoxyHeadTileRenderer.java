package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo02FoxyHeadBlockModel;
import net.mcreator.fnaffrights.block.entity.Endo02FoxyHeadTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02FoxyHeadTileRenderer extends GeoBlockRenderer<Endo02FoxyHeadTileEntity> {
	public Endo02FoxyHeadTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new Endo02FoxyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo02FoxyHeadTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
