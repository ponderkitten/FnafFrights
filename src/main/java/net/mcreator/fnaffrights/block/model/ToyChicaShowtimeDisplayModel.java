package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaShowtimeDisplayItem;

public class ToyChicaShowtimeDisplayModel extends AnimatedGeoModel<ToyChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
