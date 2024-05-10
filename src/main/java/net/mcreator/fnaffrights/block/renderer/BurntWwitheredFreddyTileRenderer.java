package net.mcreator.fnaffrights.block.renderer;

public class BurntWwitheredFreddyTileRenderer extends GeoBlockRenderer<BurntWwitheredFreddyTileEntity> {
	public BurntWwitheredFreddyTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BurntWwitheredFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(BurntWwitheredFreddyTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}