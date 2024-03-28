package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieShowtimeActiveDisplayItem;

public class SpringBonnieBunnieShowtimeActiveDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
