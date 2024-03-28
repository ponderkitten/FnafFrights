package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyShowtimeActiveDisplayItem;

public class FoxyShowtimeActiveDisplayModel extends AnimatedGeoModel<FoxyShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
