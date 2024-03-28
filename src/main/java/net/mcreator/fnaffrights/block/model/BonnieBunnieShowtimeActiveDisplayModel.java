package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieShowtimeActiveDisplayItem;

public class BonnieBunnieShowtimeActiveDisplayModel extends AnimatedGeoModel<BonnieBunnieShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
