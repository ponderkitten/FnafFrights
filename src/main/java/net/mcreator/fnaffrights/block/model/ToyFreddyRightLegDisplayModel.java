package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyRightLegDisplayItem;

public class ToyFreddyRightLegDisplayModel extends AnimatedGeoModel<ToyFreddyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
