package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ASpringtrapShowtimeDisplayItem;

public class ASpringtrapShowtimeDisplayModel extends AnimatedGeoModel<ASpringtrapShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ASpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringtrapShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
