package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FoxyArcadeDisplayModel;
import net.mcreator.fnaffrights.block.display.FoxyArcadeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoxyArcadeDisplayItemRenderer extends GeoItemRenderer<FoxyArcadeDisplayItem> {
	public FoxyArcadeDisplayItemRenderer() {
		super(new FoxyArcadeDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyArcadeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
