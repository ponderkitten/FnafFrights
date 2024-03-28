package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AYellowBearShowtimeDisplayItem;

public class AYellowBearShowtimeDisplayModel extends AnimatedGeoModel<AYellowBearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AYellowBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AYellowBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AYellowBearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
