package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieShowtimeActiveDisplayItem;

public class SpringBonnieShowtimeActiveDisplayModel extends AnimatedGeoModel<SpringBonnieShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
