package net.mcreator.fnaffrights.block.renderer;

public class BloodchicaAnimatedblockDisplayItemRenderer extends GeoItemRenderer<BloodchicaAnimatedblockDisplayItem> {
	public BloodchicaAnimatedblockDisplayItemRenderer() {
		super(new BloodchicaAnimatedblockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BloodchicaAnimatedblockDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}