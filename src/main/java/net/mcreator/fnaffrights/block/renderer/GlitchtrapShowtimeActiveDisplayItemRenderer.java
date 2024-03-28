package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.GlitchtrapShowtimeActiveDisplayModel;
import net.mcreator.fnaffrights.block.display.GlitchtrapShowtimeActiveDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GlitchtrapShowtimeActiveDisplayItemRenderer extends GeoItemRenderer<GlitchtrapShowtimeActiveDisplayItem> {
	public GlitchtrapShowtimeActiveDisplayItemRenderer() {
		super(new GlitchtrapShowtimeActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(GlitchtrapShowtimeActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
