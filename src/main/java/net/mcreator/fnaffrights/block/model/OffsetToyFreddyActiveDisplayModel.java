package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetToyFreddyActiveDisplayItem;

public class OffsetToyFreddyActiveDisplayModel extends AnimatedGeoModel<OffsetToyFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
