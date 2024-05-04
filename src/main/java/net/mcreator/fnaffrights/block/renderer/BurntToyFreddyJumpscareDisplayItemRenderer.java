package net.mcreator.fnaffrights.block.renderer;

public class BurntToyFreddyJumpscareDisplayItemRenderer extends GeoItemRenderer<BurntToyFreddyJumpscareDisplayItem> {
	public BurntToyFreddyJumpscareDisplayItemRenderer() {
		super(new BurntToyFreddyJumpscareDisplayModel());
	}

	@Override
	public RenderType getRenderType(BurntToyFreddyJumpscareDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}