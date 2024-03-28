package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaTorsoDisplayItem;

public class ToyChicaTorsoDisplayModel extends AnimatedGeoModel<ToyChicaTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicatorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicatorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
