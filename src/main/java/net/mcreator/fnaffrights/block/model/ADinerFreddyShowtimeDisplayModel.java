package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerFreddyShowtimeDisplayItem;

public class ADinerFreddyShowtimeDisplayModel extends AnimatedGeoModel<ADinerFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
