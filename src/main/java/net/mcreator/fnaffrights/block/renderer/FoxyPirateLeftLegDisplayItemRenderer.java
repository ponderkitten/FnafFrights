package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FoxyPirateLeftLegDisplayModel;
import net.mcreator.fnaffrights.block.display.FoxyPirateLeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoxyPirateLeftLegDisplayItemRenderer extends GeoItemRenderer<FoxyPirateLeftLegDisplayItem> {
	public FoxyPirateLeftLegDisplayItemRenderer() {
		super(new FoxyPirateLeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyPirateLeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
