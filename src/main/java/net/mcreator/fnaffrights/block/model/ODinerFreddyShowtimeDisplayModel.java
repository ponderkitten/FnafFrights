package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ODinerFreddyShowtimeDisplayItem;

public class ODinerFreddyShowtimeDisplayModel extends AnimatedGeoModel<ODinerFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
