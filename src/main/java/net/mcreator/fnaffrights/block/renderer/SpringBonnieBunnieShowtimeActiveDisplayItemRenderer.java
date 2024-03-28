package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.SpringBonnieBunnieShowtimeActiveDisplayModel;
import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieShowtimeActiveDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpringBonnieBunnieShowtimeActiveDisplayItemRenderer extends GeoItemRenderer<SpringBonnieBunnieShowtimeActiveDisplayItem> {
	public SpringBonnieBunnieShowtimeActiveDisplayItemRenderer() {
		super(new SpringBonnieBunnieShowtimeActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieBunnieShowtimeActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
