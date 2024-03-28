package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.YellowBearRightArmDisplayItem;

public class YellowBearRightArmDisplayModel extends AnimatedGeoModel<YellowBearRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
