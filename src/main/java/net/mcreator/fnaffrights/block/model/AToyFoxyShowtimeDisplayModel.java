package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyFoxyShowtimeDisplayItem;

public class AToyFoxyShowtimeDisplayModel extends AnimatedGeoModel<AToyFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
