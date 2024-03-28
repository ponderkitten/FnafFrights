package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ABonnieBunnieShowtimeDisplayItem;

public class ABonnieBunnieShowtimeDisplayModel extends AnimatedGeoModel<ABonnieBunnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieBunnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
