package net.mcreator.fnaffrights.block.model;

public class PuppetwalldecorDisplayModel extends AnimatedGeoModel<PuppetwalldecorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetwalldecorDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetwalldecorDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetwalldecorDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppet.png");
	}
}