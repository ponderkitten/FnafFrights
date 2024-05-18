package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerFoxyActiveDisplayItem;

public class DinerFoxyActiveDisplayModel extends AnimatedGeoModel<DinerFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfoxyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfoxyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
