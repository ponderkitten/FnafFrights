package net.mcreator.fnaffrights.block.renderer;

public class PuppetwalldecorTileRenderer extends GeoBlockRenderer<PuppetwalldecorTileEntity> {
	public PuppetwalldecorTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new PuppetwalldecorBlockModel());
	}

	@Override
	public RenderType getRenderType(PuppetwalldecorTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}