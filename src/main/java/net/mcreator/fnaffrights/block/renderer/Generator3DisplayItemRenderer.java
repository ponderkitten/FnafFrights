package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Generator3DisplayModel;
import net.mcreator.fnaffrights.block.display.Generator3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Generator3DisplayItemRenderer extends GeoItemRenderer<Generator3DisplayItem> {
	public Generator3DisplayItemRenderer() {
		super(new Generator3DisplayModel());
	}

	@Override
	public RenderType getRenderType(Generator3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
