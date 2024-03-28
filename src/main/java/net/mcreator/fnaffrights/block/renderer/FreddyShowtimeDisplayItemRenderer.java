package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FreddyShowtimeDisplayModel;
import net.mcreator.fnaffrights.block.display.FreddyShowtimeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FreddyShowtimeDisplayItemRenderer extends GeoItemRenderer<FreddyShowtimeDisplayItem> {
	public FreddyShowtimeDisplayItemRenderer() {
		super(new FreddyShowtimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyShowtimeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
