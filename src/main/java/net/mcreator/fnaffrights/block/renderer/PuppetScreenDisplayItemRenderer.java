package net.mcreator.fnaffrights.block.renderer;

public class PuppetScreenDisplayItemRenderer extends GeoItemRenderer<PuppetScreenDisplayItem> {
	public PuppetScreenDisplayItemRenderer() {
		super(new PuppetScreenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuppetScreenDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}