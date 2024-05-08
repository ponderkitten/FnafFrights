package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FoxyArcadeOnDisplayModel;
import net.mcreator.fnaffrights.block.display.FoxyArcadeOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoxyArcadeOnDisplayItemRenderer extends GeoItemRenderer<FoxyArcadeOnDisplayItem> {
	public FoxyArcadeOnDisplayItemRenderer() {
		super(new FoxyArcadeOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyArcadeOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
