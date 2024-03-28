package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFreddyShowtimeDisplayItem;

public class OffsetFreddyShowtimeDisplayModel extends AnimatedGeoModel<OffsetFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
