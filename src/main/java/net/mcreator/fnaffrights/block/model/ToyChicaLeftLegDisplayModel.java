package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaLeftLegDisplayItem;

public class ToyChicaLeftLegDisplayModel extends AnimatedGeoModel<ToyChicaLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicaleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicaleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
