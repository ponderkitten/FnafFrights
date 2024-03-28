package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FreddyFazbearRightArmDisplayModel;
import net.mcreator.fnaffrights.block.display.FreddyFazbearRightArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FreddyFazbearRightArmDisplayItemRenderer extends GeoItemRenderer<FreddyFazbearRightArmDisplayItem> {
	public FreddyFazbearRightArmDisplayItemRenderer() {
		super(new FreddyFazbearRightArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyFazbearRightArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
