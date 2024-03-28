package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredBearRightArmDisplayItem;

public class FredBearRightArmDisplayModel extends AnimatedGeoModel<FredBearRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
