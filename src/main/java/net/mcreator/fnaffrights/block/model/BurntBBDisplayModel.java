package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BurntBBDisplayItem;

public class BurntBBDisplayModel extends AnimatedGeoModel<BurntBBDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntBBDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntBBDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntBBDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bb_burnt.png");
	}
}
