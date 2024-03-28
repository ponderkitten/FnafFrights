
package net.mcreator.fnaffrights.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnaffrights.entity.model.BalloonBotModel;
import net.mcreator.fnaffrights.entity.layer.BalloonBotLayer;
import net.mcreator.fnaffrights.entity.BalloonBotEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BalloonBotRenderer extends GeoEntityRenderer<BalloonBotEntity> {
	public BalloonBotRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BalloonBotModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new BalloonBotLayer(this));
	}

	@Override
	public RenderType getRenderType(BalloonBotEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.5f, 0.5f, 0.5f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
