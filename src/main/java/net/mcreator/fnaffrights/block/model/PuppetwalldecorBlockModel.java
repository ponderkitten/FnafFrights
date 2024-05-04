package net.mcreator.fnaffrights.block.model;

public class PuppetwalldecorBlockModel extends AnimatedGeoModel<PuppetwalldecorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetwalldecorTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetwalldecorTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetwalldecorTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppet.png");
	}
}