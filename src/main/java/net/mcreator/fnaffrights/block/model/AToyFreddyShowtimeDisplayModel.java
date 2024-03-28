package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyFreddyShowtimeDisplayItem;

public class AToyFreddyShowtimeDisplayModel extends AnimatedGeoModel<AToyFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
