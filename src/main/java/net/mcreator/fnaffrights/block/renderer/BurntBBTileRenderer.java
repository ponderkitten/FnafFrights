package net.mcreator.fnaffrights.block.renderer;

public class BurntBBTileRenderer extends GeoBlockRenderer<BurntBBTileEntity> {
	public BurntBBTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BurntBBBlockModel());
	}

	@Override
	public RenderType getRenderType(BurntBBTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}