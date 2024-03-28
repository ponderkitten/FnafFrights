package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AShavenBonnieShowtimeDisplayItem;

public class AShavenBonnieShowtimeDisplayModel extends AnimatedGeoModel<AShavenBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AShavenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AShavenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AShavenBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
