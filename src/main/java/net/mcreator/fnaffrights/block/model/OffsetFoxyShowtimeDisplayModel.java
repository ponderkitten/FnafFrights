package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFoxyShowtimeDisplayItem;

public class OffsetFoxyShowtimeDisplayModel extends AnimatedGeoModel<OffsetFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
