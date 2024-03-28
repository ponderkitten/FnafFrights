package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieShowtimeDisplayItem;

public class SpringBonnieBunnieShowtimeDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
