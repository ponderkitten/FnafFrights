package net.mcreator.fnaffrights.block.renderer;

public class FoxyArcadeOnTileRenderer extends GeoBlockRenderer<FoxyArcadeOnTileEntity> {
	public FoxyArcadeOnTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new FoxyArcadeOnBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyArcadeOnTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}