package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyHeadDisplayItem;

public class ToyFreddyHeadDisplayModel extends AnimatedGeoModel<ToyFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
