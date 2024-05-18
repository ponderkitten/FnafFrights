package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerFreddyShowtimeDisplayItem;

public class DinerFreddyShowtimeDisplayModel extends AnimatedGeoModel<DinerFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
