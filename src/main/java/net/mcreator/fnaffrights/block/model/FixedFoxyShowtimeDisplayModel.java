package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FixedFoxyShowtimeDisplayItem;

public class FixedFoxyShowtimeDisplayModel extends AnimatedGeoModel<FixedFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FixedFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FixedFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FixedFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
