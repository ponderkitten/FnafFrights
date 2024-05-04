package net.mcreator.fnaffrights.block.model;

public class BurntToyFreddyJumpscareDisplayModel extends AnimatedGeoModel<BurntToyFreddyJumpscareDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyFreddyJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/burntjumpscaretoyfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyFreddyJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/burntjumpscaretoyfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyFreddyJumpscareDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toyfreddy.png");
	}
}