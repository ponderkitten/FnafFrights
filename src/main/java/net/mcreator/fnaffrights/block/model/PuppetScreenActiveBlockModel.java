package net.mcreator.fnaffrights.block.model;

public class PuppetScreenActiveBlockModel extends AnimatedGeoModel<PuppetScreenActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreenstatic.png");
	}
}