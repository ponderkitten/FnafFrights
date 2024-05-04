package net.mcreator.fnaffrights.block.renderer;

public class BurntToyChicaDisplayItemRenderer extends GeoItemRenderer<BurntToyChicaDisplayItem> {
	public BurntToyChicaDisplayItemRenderer() {
		super(new BurntToyChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(BurntToyChicaDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}