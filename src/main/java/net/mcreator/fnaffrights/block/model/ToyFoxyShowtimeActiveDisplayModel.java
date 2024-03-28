package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyShowtimeActiveDisplayItem;

public class ToyFoxyShowtimeActiveDisplayModel extends AnimatedGeoModel<ToyFoxyShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
