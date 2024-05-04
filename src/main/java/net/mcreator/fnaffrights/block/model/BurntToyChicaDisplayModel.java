package net.mcreator.fnaffrights.block.model;

public class BurntToyChicaDisplayModel extends AnimatedGeoModel<BurntToyChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/burnttoychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/burnttoychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyChicaDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toychica.png");
	}
}