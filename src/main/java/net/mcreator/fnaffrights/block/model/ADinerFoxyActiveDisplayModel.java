package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerFoxyActiveDisplayItem;

public class ADinerFoxyActiveDisplayModel extends AnimatedGeoModel<ADinerFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfoxyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfoxyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
