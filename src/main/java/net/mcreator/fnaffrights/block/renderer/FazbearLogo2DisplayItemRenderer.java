package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.FazbearLogo2DisplayModel;
import net.mcreator.fnaffrights.block.display.FazbearLogo2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FazbearLogo2DisplayItemRenderer extends GeoItemRenderer<FazbearLogo2DisplayItem> {
	public FazbearLogo2DisplayItemRenderer() {
		super(new FazbearLogo2DisplayModel());
	}

	@Override
	public RenderType getRenderType(FazbearLogo2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
