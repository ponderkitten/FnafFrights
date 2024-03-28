package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringtrapShowtimeActiveDisplayItem;

public class SpringtrapShowtimeActiveDisplayModel extends AnimatedGeoModel<SpringtrapShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springtrapshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springtrapshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
