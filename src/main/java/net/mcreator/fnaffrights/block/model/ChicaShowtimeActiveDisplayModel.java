package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaShowtimeActiveDisplayItem;

public class ChicaShowtimeActiveDisplayModel extends AnimatedGeoModel<ChicaShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
