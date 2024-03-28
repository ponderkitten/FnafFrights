package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo02FoxyHeadDisplayModel;
import net.mcreator.fnaffrights.block.display.Endo02FoxyHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02FoxyHeadDisplayItemRenderer extends GeoItemRenderer<Endo02FoxyHeadDisplayItem> {
	public Endo02FoxyHeadDisplayItemRenderer() {
		super(new Endo02FoxyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02FoxyHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
