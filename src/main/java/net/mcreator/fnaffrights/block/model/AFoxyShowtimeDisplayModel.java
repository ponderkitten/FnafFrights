package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFoxyShowtimeDisplayItem;

public class AFoxyShowtimeDisplayModel extends AnimatedGeoModel<AFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
