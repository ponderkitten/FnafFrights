package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo01LeftLegDisplayModel;
import net.mcreator.fnaffrights.block.display.Endo01LeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01LeftLegDisplayItemRenderer extends GeoItemRenderer<Endo01LeftLegDisplayItem> {
	public Endo01LeftLegDisplayItemRenderer() {
		super(new Endo01LeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01LeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
