package net.mcreator.fnaffrights.block.renderer;

public class BurntMangleTileRenderer extends GeoBlockRenderer<BurntMangleTileEntity> {
	public BurntMangleTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BurntMangleBlockModel());
	}

	@Override
	public RenderType getRenderType(BurntMangleTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}