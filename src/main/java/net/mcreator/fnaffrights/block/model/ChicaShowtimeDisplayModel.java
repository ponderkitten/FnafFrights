package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaShowtimeDisplayItem;

public class ChicaShowtimeDisplayModel extends AnimatedGeoModel<ChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
