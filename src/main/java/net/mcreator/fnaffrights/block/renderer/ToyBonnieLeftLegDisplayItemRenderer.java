package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.ToyBonnieLeftLegDisplayModel;
import net.mcreator.fnaffrights.block.display.ToyBonnieLeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToyBonnieLeftLegDisplayItemRenderer extends GeoItemRenderer<ToyBonnieLeftLegDisplayItem> {
	public ToyBonnieLeftLegDisplayItemRenderer() {
		super(new ToyBonnieLeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieLeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
