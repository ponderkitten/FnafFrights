package net.mcreator.fnaffrights.block.model;

public class BurntToyBonnieJumpscareBlockModel extends AnimatedGeoModel<BurntToyBonnieJumpscareTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyBonnieJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyBonnieJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyBonnieJumpscareTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toybonnie.png");
	}
}