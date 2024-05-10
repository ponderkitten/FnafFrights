package net.mcreator.fnaffrights.block.model;

public class FoxyArcadeOnBlockModel extends AnimatedGeoModel<FoxyArcadeOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyArcadeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyarcadeon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyArcadeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyarcadeon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyArcadeOnTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxyarcadeon.png");
	}
}