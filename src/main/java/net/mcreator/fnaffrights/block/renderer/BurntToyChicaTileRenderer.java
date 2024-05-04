package net.mcreator.fnaffrights.block.renderer;

public class BurntToyChicaTileRenderer extends GeoBlockRenderer<BurntToyChicaTileEntity> {
	public BurntToyChicaTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BurntToyChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(BurntToyChicaTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}