package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaShowtimeActiveDisplayItem;

public class ToyChicaShowtimeActiveDisplayModel extends AnimatedGeoModel<ToyChicaShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
