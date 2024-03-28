package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyShowtimeActiveDisplayItem;

public class FreddyShowtimeActiveDisplayModel extends AnimatedGeoModel<FreddyShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
