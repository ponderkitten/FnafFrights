package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerBonnieShowtimeDisplayItem;

public class ADinerBonnieShowtimeDisplayModel extends AnimatedGeoModel<ADinerBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
