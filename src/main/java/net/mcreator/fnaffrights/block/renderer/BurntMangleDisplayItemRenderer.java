package net.mcreator.fnaffrights.block.renderer;

public class BurntMangleDisplayItemRenderer extends GeoItemRenderer<BurntMangleDisplayItem> {
	public BurntMangleDisplayItemRenderer() {
		super(new BurntMangleDisplayModel());
	}

	@Override
	public RenderType getRenderType(BurntMangleDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}