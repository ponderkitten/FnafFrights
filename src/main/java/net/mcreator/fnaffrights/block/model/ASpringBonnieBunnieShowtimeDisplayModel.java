package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ASpringBonnieBunnieShowtimeDisplayItem;

public class ASpringBonnieBunnieShowtimeDisplayModel extends AnimatedGeoModel<ASpringBonnieBunnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieBunnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieBunnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
