package net.mcreator.fnaffrights.block.renderer;

public class BurntToyFreddyJumpscareTileRenderer extends GeoBlockRenderer<BurntToyFreddyJumpscareTileEntity> {
	public BurntToyFreddyJumpscareTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BurntToyFreddyJumpscareBlockModel());
	}

	@Override
	public RenderType getRenderType(BurntToyFreddyJumpscareTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}