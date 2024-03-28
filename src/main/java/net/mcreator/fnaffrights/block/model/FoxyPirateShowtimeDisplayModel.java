package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateShowtimeDisplayItem;

public class FoxyPirateShowtimeDisplayModel extends AnimatedGeoModel<FoxyPirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
