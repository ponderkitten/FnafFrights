package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.VassilisADisplayModel;
import net.mcreator.fnaffrights.block.display.VassilisADisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VassilisADisplayItemRenderer extends GeoItemRenderer<VassilisADisplayItem> {
	public VassilisADisplayItemRenderer() {
		super(new VassilisADisplayModel());
	}

	@Override
	public RenderType getRenderType(VassilisADisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
