package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo01HeadDisplayModel;
import net.mcreator.fnaffrights.block.display.Endo01HeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01HeadDisplayItemRenderer extends GeoItemRenderer<Endo01HeadDisplayItem> {
	public Endo01HeadDisplayItemRenderer() {
		super(new Endo01HeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01HeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
