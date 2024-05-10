package net.mcreator.fnaffrights.block.renderer;

public class FoxyArcadeTileRenderer extends GeoBlockRenderer<FoxyArcadeTileEntity> {
	public FoxyArcadeTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new FoxyArcadeBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyArcadeTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}