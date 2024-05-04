package net.mcreator.fnaffrights.block.model;

public class BurntToyChicaBlockModel extends AnimatedGeoModel<BurntToyChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/burnttoychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/burnttoychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyChicaTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toychica.png");
	}
}