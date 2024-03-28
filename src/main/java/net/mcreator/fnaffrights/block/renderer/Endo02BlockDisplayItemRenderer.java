package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo02BlockDisplayModel;
import net.mcreator.fnaffrights.block.display.Endo02BlockDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02BlockDisplayItemRenderer extends GeoItemRenderer<Endo02BlockDisplayItem> {
	public Endo02BlockDisplayItemRenderer() {
		super(new Endo02BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02BlockDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
