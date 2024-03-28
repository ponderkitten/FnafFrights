package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyShowtimeDisplayItem;

public class FreddyShowtimeDisplayModel extends AnimatedGeoModel<FreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
