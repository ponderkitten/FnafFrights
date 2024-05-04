package net.mcreator.fnaffrights.block.renderer;

public class PuppetScreenTileRenderer extends GeoBlockRenderer<PuppetScreenTileEntity> {
	public PuppetScreenTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new PuppetScreenBlockModel());
	}

	@Override
	public RenderType getRenderType(PuppetScreenTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}