package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFixedFoxyShowtimeDisplayItem;

public class OffsetFixedFoxyShowtimeDisplayModel extends AnimatedGeoModel<OffsetFixedFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFixedFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFixedFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFixedFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
