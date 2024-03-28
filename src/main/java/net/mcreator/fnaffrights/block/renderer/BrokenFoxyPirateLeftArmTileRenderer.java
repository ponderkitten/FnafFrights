package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.BrokenFoxyPirateLeftArmBlockModel;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateLeftArmTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BrokenFoxyPirateLeftArmTileRenderer extends GeoBlockRenderer<BrokenFoxyPirateLeftArmTileEntity> {
	public BrokenFoxyPirateLeftArmTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BrokenFoxyPirateLeftArmBlockModel());
	}

	@Override
	public RenderType getRenderType(BrokenFoxyPirateLeftArmTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
