package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AYellowBearActiveDisplayItem;

public class AYellowBearActiveDisplayModel extends AnimatedGeoModel<AYellowBearActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AYellowBearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AYellowBearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AYellowBearActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
