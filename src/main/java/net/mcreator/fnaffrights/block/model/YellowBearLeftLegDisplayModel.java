package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.YellowBearLeftLegDisplayItem;

public class YellowBearLeftLegDisplayModel extends AnimatedGeoModel<YellowBearLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
