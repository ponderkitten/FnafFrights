package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Generator5DisplayModel;
import net.mcreator.fnaffrights.block.display.Generator5DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Generator5DisplayItemRenderer extends GeoItemRenderer<Generator5DisplayItem> {
	public Generator5DisplayItemRenderer() {
		super(new Generator5DisplayModel());
	}

	@Override
	public RenderType getRenderType(Generator5DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
