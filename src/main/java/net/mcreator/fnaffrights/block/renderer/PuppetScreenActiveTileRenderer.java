package net.mcreator.fnaffrights.block.renderer;

public class PuppetScreenActiveTileRenderer extends GeoBlockRenderer<PuppetScreenActiveTileEntity> {
	public PuppetScreenActiveTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new PuppetScreenActiveBlockModel());
	}

	@Override
	public RenderType getRenderType(PuppetScreenActiveTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}