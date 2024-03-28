package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.UnBonnieShowtimeActiveDisplayItem;

public class UnBonnieShowtimeActiveDisplayModel extends AnimatedGeoModel<UnBonnieShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnBonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnBonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnBonnieShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
