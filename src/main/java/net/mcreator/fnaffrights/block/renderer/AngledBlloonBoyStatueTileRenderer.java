package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.AngledBlloonBoyStatueBlockModel;
import net.mcreator.fnaffrights.block.entity.AngledBlloonBoyStatueTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngledBlloonBoyStatueTileRenderer extends GeoBlockRenderer<AngledBlloonBoyStatueTileEntity> {
	public AngledBlloonBoyStatueTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AngledBlloonBoyStatueBlockModel());
	}

	@Override
	public RenderType getRenderType(AngledBlloonBoyStatueTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
