package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.GoldenFreddyShowtimeDisplayItem;

public class GoldenFreddyShowtimeDisplayModel extends AnimatedGeoModel<GoldenFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
