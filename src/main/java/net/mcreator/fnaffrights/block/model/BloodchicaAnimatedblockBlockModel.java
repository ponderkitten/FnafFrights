package net.mcreator.fnaffrights.block.model;

public class BloodchicaAnimatedblockBlockModel extends AnimatedGeoModel<BloodchicaAnimatedblockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BloodchicaAnimatedblockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bloodchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BloodchicaAnimatedblockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bloodchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BloodchicaAnimatedblockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bloodchica.png");
	}
}