package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.DinerBonnieActiveDisplayModel;
import net.mcreator.fnaffrights.block.display.DinerBonnieActiveDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DinerBonnieActiveDisplayItemRenderer extends GeoItemRenderer<DinerBonnieActiveDisplayItem> {
	public DinerBonnieActiveDisplayItemRenderer() {
		super(new DinerBonnieActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(DinerBonnieActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
