package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.AShavenBonnieActiveDisplayModel;
import net.mcreator.fnaffrights.block.display.AShavenBonnieActiveDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AShavenBonnieActiveDisplayItemRenderer extends GeoItemRenderer<AShavenBonnieActiveDisplayItem> {
	public AShavenBonnieActiveDisplayItemRenderer() {
		super(new AShavenBonnieActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(AShavenBonnieActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
