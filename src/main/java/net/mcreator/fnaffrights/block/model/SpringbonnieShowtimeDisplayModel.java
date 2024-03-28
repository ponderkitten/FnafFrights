package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringbonnieShowtimeDisplayItem;

public class SpringbonnieShowtimeDisplayModel extends AnimatedGeoModel<SpringbonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
