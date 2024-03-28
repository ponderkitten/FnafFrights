package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaLeftArmDisplayItem;

public class ToyChicaLeftArmDisplayModel extends AnimatedGeoModel<ToyChicaLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicaleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicaleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
