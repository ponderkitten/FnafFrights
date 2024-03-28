package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.YellowBearHeadDisplayItem;

public class YellowBearHeadDisplayModel extends AnimatedGeoModel<YellowBearHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
