package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo02ChicaHeadDisplayModel;
import net.mcreator.fnaffrights.block.display.Endo02ChicaHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02ChicaHeadDisplayItemRenderer extends GeoItemRenderer<Endo02ChicaHeadDisplayItem> {
	public Endo02ChicaHeadDisplayItemRenderer() {
		super(new Endo02ChicaHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02ChicaHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
