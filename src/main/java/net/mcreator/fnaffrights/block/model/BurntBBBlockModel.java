package net.mcreator.fnaffrights.block.model;

public class BurntBBBlockModel extends AnimatedGeoModel<BurntBBTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntBBTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntBBTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntBBTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bb_burnt.png");
	}
}