package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerBonnieShowtimeDisplayItem;

public class DinerBonnieShowtimeDisplayModel extends AnimatedGeoModel<DinerBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
