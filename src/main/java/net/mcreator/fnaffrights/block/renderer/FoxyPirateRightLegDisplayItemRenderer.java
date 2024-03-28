package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FoxyPirateRightLegDisplayModel;
import net.mcreator.fnaffrights.block.display.FoxyPirateRightLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoxyPirateRightLegDisplayItemRenderer extends GeoItemRenderer<FoxyPirateRightLegDisplayItem> {
	public FoxyPirateRightLegDisplayItemRenderer() {
		super(new FoxyPirateRightLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyPirateRightLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
