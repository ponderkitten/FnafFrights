package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredBearLeftArmDisplayItem;

public class FredBearLeftArmDisplayModel extends AnimatedGeoModel<FredBearLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
