package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Endo01RightArmDisplayModel;
import net.mcreator.fnaffrights.block.display.Endo01RightArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01RightArmDisplayItemRenderer extends GeoItemRenderer<Endo01RightArmDisplayItem> {
	public Endo01RightArmDisplayItemRenderer() {
		super(new Endo01RightArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01RightArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
