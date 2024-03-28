package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasFreddyDisplayItem;

public class ChristmasFreddyDisplayModel extends AnimatedGeoModel<ChristmasFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFreddyDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasfreddy.png");
	}
}
