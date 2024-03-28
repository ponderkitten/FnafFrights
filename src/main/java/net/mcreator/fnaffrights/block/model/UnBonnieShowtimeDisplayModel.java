package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.UnBonnieShowtimeDisplayItem;

public class UnBonnieShowtimeDisplayModel extends AnimatedGeoModel<UnBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
