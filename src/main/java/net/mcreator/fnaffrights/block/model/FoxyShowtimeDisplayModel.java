package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyShowtimeDisplayItem;

public class FoxyShowtimeDisplayModel extends AnimatedGeoModel<FoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
