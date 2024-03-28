package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.ToyFoxyBlockDisplayModel;
import net.mcreator.fnaffrights.block.display.ToyFoxyBlockDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToyFoxyBlockDisplayItemRenderer extends GeoItemRenderer<ToyFoxyBlockDisplayItem> {
	public ToyFoxyBlockDisplayItemRenderer() {
		super(new ToyFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyBlockDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
