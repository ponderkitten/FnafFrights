package net.mcreator.fnaffrights.block.renderer;

public class BurntWwitheredFreddyDisplayItemRenderer extends GeoItemRenderer<BurntWwitheredFreddyDisplayItem> {
	public BurntWwitheredFreddyDisplayItemRenderer() {
		super(new BurntWwitheredFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(BurntWwitheredFreddyDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}