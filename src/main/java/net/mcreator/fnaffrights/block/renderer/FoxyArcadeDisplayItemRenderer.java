package net.mcreator.fnaffrights.block.renderer;

public class FoxyArcadeDisplayItemRenderer extends GeoItemRenderer<FoxyArcadeDisplayItem> {
	public FoxyArcadeDisplayItemRenderer() {
		super(new FoxyArcadeDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyArcadeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}