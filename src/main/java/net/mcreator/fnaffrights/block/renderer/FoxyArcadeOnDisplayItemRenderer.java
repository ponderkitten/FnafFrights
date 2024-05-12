package net.mcreator.fnaffrights.block.renderer;

public class FoxyArcadeOnDisplayItemRenderer extends GeoItemRenderer<FoxyArcadeOnDisplayItem> {
	public FoxyArcadeOnDisplayItemRenderer() {
		super(new FoxyArcadeOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyArcadeOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}