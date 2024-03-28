package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFreddyShowtimeDisplayItem;

public class AFreddyShowtimeDisplayModel extends AnimatedGeoModel<AFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
