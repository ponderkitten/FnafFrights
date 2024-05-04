package net.mcreator.fnaffrights.block.renderer;

public class BloodchicaAnimatedblockTileRenderer extends GeoBlockRenderer<BloodchicaAnimatedblockTileEntity> {
	public BloodchicaAnimatedblockTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BloodchicaAnimatedblockBlockModel());
	}

	@Override
	public RenderType getRenderType(BloodchicaAnimatedblockTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}