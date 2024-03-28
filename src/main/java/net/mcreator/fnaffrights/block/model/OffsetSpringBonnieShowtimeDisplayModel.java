package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetSpringBonnieShowtimeDisplayItem;

public class OffsetSpringBonnieShowtimeDisplayModel extends AnimatedGeoModel<OffsetSpringBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ospringbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ospringbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
