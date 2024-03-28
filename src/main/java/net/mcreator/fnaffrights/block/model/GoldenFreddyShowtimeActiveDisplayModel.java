package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.GoldenFreddyShowtimeActiveDisplayItem;

public class GoldenFreddyShowtimeActiveDisplayModel extends AnimatedGeoModel<GoldenFreddyShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddyShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
