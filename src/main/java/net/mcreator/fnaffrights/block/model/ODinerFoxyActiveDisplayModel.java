package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ODinerFoxyActiveDisplayItem;

public class ODinerFoxyActiveDisplayModel extends AnimatedGeoModel<ODinerFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfoxyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfoxyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
