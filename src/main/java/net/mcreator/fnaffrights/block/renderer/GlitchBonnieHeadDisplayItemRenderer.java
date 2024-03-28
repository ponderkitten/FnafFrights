package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.GlitchBonnieHeadDisplayModel;
import net.mcreator.fnaffrights.block.display.GlitchBonnieHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GlitchBonnieHeadDisplayItemRenderer extends GeoItemRenderer<GlitchBonnieHeadDisplayItem> {
	public GlitchBonnieHeadDisplayItemRenderer() {
		super(new GlitchBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(GlitchBonnieHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
