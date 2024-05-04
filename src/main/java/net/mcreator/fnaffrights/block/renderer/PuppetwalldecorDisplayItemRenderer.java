package net.mcreator.fnaffrights.block.renderer;

public class PuppetwalldecorDisplayItemRenderer extends GeoItemRenderer<PuppetwalldecorDisplayItem> {
	public PuppetwalldecorDisplayItemRenderer() {
		super(new PuppetwalldecorDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuppetwalldecorDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}