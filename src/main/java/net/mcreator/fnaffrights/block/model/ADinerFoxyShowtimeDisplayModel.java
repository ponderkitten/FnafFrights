package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerFoxyShowtimeDisplayItem;

public class ADinerFoxyShowtimeDisplayModel extends AnimatedGeoModel<ADinerFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
