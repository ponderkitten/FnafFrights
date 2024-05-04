package net.mcreator.fnaffrights.block.renderer;

public class PuppetScreenActiveDisplayItemRenderer extends GeoItemRenderer<PuppetScreenActiveDisplayItem> {
	public PuppetScreenActiveDisplayItemRenderer() {
		super(new PuppetScreenActiveDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuppetScreenActiveDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}