package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FreddyRightLegDisplayModel;
import net.mcreator.fnaffrights.block.display.FreddyRightLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FreddyRightLegDisplayItemRenderer extends GeoItemRenderer<FreddyRightLegDisplayItem> {
	public FreddyRightLegDisplayItemRenderer() {
		super(new FreddyRightLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyRightLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
