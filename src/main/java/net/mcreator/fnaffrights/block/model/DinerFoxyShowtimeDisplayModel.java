package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerFoxyShowtimeDisplayItem;

public class DinerFoxyShowtimeDisplayModel extends AnimatedGeoModel<DinerFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
