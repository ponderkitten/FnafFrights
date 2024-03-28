package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ABonnieShowtimeDisplayItem;

public class ABonnieShowtimeDisplayModel extends AnimatedGeoModel<ABonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
