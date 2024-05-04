package net.mcreator.fnaffrights.block.model;

public class PuppetScreenActiveDisplayModel extends AnimatedGeoModel<PuppetScreenActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreenstatic.png");
	}
}