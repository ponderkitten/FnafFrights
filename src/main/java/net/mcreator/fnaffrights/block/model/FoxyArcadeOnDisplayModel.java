package net.mcreator.fnaffrights.block.model;

public class FoxyArcadeOnDisplayModel extends AnimatedGeoModel<FoxyArcadeOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyArcadeOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyarcadeon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyArcadeOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyarcadeon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyArcadeOnDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxyarcadeon.png");
	}
}