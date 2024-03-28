package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.SpringtrapShowtimeActiveDisplayModel;
import net.mcreator.fnaffrights.block.display.SpringtrapShowtimeActiveDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpringtrapShowtimeActiveDisplayItemRenderer extends GeoItemRenderer<SpringtrapShowtimeActiveDisplayItem> {
	public SpringtrapShowtimeActiveDisplayItemRenderer() {
		super(new SpringtrapShowtimeActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringtrapShowtimeActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
