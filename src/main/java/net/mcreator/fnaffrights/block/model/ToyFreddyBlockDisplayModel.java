package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyBlockDisplayItem;

public class ToyFreddyBlockDisplayModel extends AnimatedGeoModel<ToyFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
