package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.ToyFoxyShowtimeDisplayModel;
import net.mcreator.fnaffrights.block.display.ToyFoxyShowtimeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToyFoxyShowtimeDisplayItemRenderer extends GeoItemRenderer<ToyFoxyShowtimeDisplayItem> {
	public ToyFoxyShowtimeDisplayItemRenderer() {
		super(new ToyFoxyShowtimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyShowtimeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
