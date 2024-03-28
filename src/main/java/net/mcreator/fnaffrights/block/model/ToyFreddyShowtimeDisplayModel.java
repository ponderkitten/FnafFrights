package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyShowtimeDisplayItem;

public class ToyFreddyShowtimeDisplayModel extends AnimatedGeoModel<ToyFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
