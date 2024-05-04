package net.mcreator.fnaffrights.block.renderer;

public class BurntBBDisplayItemRenderer extends GeoItemRenderer<BurntBBDisplayItem> {
	public BurntBBDisplayItemRenderer() {
		super(new BurntBBDisplayModel());
	}

	@Override
	public RenderType getRenderType(BurntBBDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}