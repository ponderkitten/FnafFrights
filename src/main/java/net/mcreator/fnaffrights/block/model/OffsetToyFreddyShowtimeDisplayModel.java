package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetToyFreddyShowtimeDisplayItem;

public class OffsetToyFreddyShowtimeDisplayModel extends AnimatedGeoModel<OffsetToyFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
