package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFixedFoxyShowtimeDisplayItem;

public class AFixedFoxyShowtimeDisplayModel extends AnimatedGeoModel<AFixedFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFixedFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFixedFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFixedFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
