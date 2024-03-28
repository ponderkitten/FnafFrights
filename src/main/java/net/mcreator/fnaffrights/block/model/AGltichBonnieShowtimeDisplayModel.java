package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AGltichBonnieShowtimeDisplayItem;

public class AGltichBonnieShowtimeDisplayModel extends AnimatedGeoModel<AGltichBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AGltichBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AGltichBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AGltichBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
