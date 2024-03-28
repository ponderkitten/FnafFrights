package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.YellowBearRightLegDisplayItem;

public class YellowBearRightLegDisplayModel extends AnimatedGeoModel<YellowBearRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
