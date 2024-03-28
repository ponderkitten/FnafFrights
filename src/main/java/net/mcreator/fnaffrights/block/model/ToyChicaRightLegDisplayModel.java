package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaRightLegDisplayItem;

public class ToyChicaRightLegDisplayModel extends AnimatedGeoModel<ToyChicaRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicarightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicarightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
