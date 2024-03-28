package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringtrapShowtimeDisplayItem;

public class SpringtrapShowtimeDisplayModel extends AnimatedGeoModel<SpringtrapShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
