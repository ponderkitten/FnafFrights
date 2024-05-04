package net.mcreator.fnaffrights.block.model;

public class BurntToyBonnieJumpscareDisplayModel extends AnimatedGeoModel<BurntToyBonnieJumpscareDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyBonnieJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyBonnieJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyBonnieJumpscareDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toybonnie.png");
	}
}