package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyRightArmDisplayItem;

public class ToyFreddyRightArmDisplayModel extends AnimatedGeoModel<ToyFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
