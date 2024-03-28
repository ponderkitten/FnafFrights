package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieShowtimeDisplayItem;

public class BonnieBunnieShowtimeDisplayModel extends AnimatedGeoModel<BonnieBunnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
