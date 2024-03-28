package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyShowtimeActiveDisplayItem;

public class ToyFreddyShowtimeActiveDisplayModel extends AnimatedGeoModel<ToyFreddyShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
