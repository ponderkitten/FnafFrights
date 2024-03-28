package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.YellowBearLeftArmDisplayItem;

public class YellowBearLeftArmDisplayModel extends AnimatedGeoModel<YellowBearLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
