package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyLeftArmDisplayItem;

public class ToyFreddyLeftArmDisplayModel extends AnimatedGeoModel<ToyFreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
