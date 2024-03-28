package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ASpringBonnieShowtimeDisplayItem;

public class ASpringBonnieShowtimeDisplayModel extends AnimatedGeoModel<ASpringBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
