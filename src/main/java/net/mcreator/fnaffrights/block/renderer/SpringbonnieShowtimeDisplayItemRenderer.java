package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.SpringbonnieShowtimeDisplayModel;
import net.mcreator.fnaffrights.block.display.SpringbonnieShowtimeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpringbonnieShowtimeDisplayItemRenderer extends GeoItemRenderer<SpringbonnieShowtimeDisplayItem> {
	public SpringbonnieShowtimeDisplayItemRenderer() {
		super(new SpringbonnieShowtimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieShowtimeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
