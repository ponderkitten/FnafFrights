package net.mcreator.fnaffrights.block.model;

public class BurntBBDisplayModel extends AnimatedGeoModel<BurntBBDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntBBDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntBBDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntBBDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bb_burnt.png");
	}
}