package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.BonnieRightLegDisplayModel;
import net.mcreator.fnaffrights.block.display.BonnieRightLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BonnieRightLegDisplayItemRenderer extends GeoItemRenderer<BonnieRightLegDisplayItem> {
	public BonnieRightLegDisplayItemRenderer() {
		super(new BonnieRightLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnieRightLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
