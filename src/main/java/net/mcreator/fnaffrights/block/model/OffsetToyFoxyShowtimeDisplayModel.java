package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetToyFoxyShowtimeDisplayItem;

public class OffsetToyFoxyShowtimeDisplayModel extends AnimatedGeoModel<OffsetToyFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
