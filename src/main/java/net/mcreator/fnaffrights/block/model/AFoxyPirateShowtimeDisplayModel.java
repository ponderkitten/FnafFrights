package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFoxyPirateShowtimeDisplayItem;

public class AFoxyPirateShowtimeDisplayModel extends AnimatedGeoModel<AFoxyPirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyPirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyPirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyPirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
