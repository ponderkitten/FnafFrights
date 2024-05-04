package net.mcreator.fnaffrights.block.renderer;

public class BurntToyBonnieJumpscareDisplayItemRenderer extends GeoItemRenderer<BurntToyBonnieJumpscareDisplayItem> {
	public BurntToyBonnieJumpscareDisplayItemRenderer() {
		super(new BurntToyBonnieJumpscareDisplayModel());
	}

	@Override
	public RenderType getRenderType(BurntToyBonnieJumpscareDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}