package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.ADinerFoxyActiveDisplayModel;
import net.mcreator.fnaffrights.block.display.ADinerFoxyActiveDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ADinerFoxyActiveDisplayItemRenderer extends GeoItemRenderer<ADinerFoxyActiveDisplayItem> {
	public ADinerFoxyActiveDisplayItemRenderer() {
		super(new ADinerFoxyActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(ADinerFoxyActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
