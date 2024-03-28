package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaRightArmDisplayItem;

public class ToyChicaRightArmDisplayModel extends AnimatedGeoModel<ToyChicaRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicarightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicarightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
