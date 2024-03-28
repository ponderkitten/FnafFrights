package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyShowtimeDisplayItem;

public class ToyFoxyShowtimeDisplayModel extends AnimatedGeoModel<ToyFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
