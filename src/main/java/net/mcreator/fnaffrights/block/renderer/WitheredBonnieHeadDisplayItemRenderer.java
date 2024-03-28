package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.WitheredBonnieHeadDisplayModel;
import net.mcreator.fnaffrights.block.display.WitheredBonnieHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredBonnieHeadDisplayItemRenderer extends GeoItemRenderer<WitheredBonnieHeadDisplayItem> {
	public WitheredBonnieHeadDisplayItemRenderer() {
		super(new WitheredBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredBonnieHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
