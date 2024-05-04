package net.mcreator.fnaffrights.block.model;

public class PuppetScreenBlockModel extends AnimatedGeoModel<PuppetScreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreen.png");
	}
}