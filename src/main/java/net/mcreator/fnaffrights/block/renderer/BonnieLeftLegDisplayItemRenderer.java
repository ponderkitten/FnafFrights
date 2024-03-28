package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.BonnieLeftLegDisplayModel;
import net.mcreator.fnaffrights.block.display.BonnieLeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BonnieLeftLegDisplayItemRenderer extends GeoItemRenderer<BonnieLeftLegDisplayItem> {
	public BonnieLeftLegDisplayItemRenderer() {
		super(new BonnieLeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnieLeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
