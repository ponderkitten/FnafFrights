package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyLeftLegDisplayItem;

public class ToyFreddyLeftLegDisplayModel extends AnimatedGeoModel<ToyFreddyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
