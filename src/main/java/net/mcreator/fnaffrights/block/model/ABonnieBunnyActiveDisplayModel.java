package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ABonnieBunnyActiveDisplayItem;

public class ABonnieBunnyActiveDisplayModel extends AnimatedGeoModel<ABonnieBunnyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieBunnyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieBunnyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieBunnyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
