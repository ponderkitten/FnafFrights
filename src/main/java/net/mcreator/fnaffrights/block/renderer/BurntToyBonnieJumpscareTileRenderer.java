package net.mcreator.fnaffrights.block.renderer;

public class BurntToyBonnieJumpscareTileRenderer extends GeoBlockRenderer<BurntToyBonnieJumpscareTileEntity> {
	public BurntToyBonnieJumpscareTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BurntToyBonnieJumpscareBlockModel());
	}

	@Override
	public RenderType getRenderType(BurntToyBonnieJumpscareTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}