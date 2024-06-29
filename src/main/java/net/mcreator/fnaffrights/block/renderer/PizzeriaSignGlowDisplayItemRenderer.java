package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.PizzeriaSignGlowDisplayModel;
import net.mcreator.fnaffrights.block.display.PizzeriaSignGlowDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzeriaSignGlowDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignGlowDisplayItem> {
	public PizzeriaSignGlowDisplayItemRenderer() {
		super(new PizzeriaSignGlowDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignGlowDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
