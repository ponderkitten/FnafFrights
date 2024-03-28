package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasBonnieDisplayItem;

public class ChristmasBonnieDisplayModel extends AnimatedGeoModel<ChristmasBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasBonnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasBonnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasBonnieDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasbonnieflat.png");
	}
}
