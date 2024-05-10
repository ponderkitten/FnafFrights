package net.mcreator.fnaffrights.block.model;

public class FoxyArcadeDisplayModel extends AnimatedGeoModel<FoxyArcadeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyArcadeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyarcade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyArcadeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyarcade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyArcadeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxyarcade.png");
	}
}