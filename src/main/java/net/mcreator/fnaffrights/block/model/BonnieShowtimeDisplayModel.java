package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieShowtimeDisplayItem;

public class BonnieShowtimeDisplayModel extends AnimatedGeoModel<BonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
