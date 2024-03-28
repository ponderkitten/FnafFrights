package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFoxyPirateShowtimeDisplayItem;

public class OffsetFoxyPirateShowtimeDisplayModel extends AnimatedGeoModel<OffsetFoxyPirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyPirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyPirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyPirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
