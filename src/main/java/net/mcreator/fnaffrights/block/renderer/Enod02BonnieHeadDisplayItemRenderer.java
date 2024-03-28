package net.mcreator.fnaffrights.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.block.model.Enod02BonnieHeadDisplayModel;
import net.mcreator.fnaffrights.block.display.Enod02BonnieHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Enod02BonnieHeadDisplayItemRenderer extends GeoItemRenderer<Enod02BonnieHeadDisplayItem> {
	public Enod02BonnieHeadDisplayItemRenderer() {
		super(new Enod02BonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Enod02BonnieHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
