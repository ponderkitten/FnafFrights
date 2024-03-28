package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaHeadDisplayItem;

public class ToyChicaHeadDisplayModel extends AnimatedGeoModel<ToyChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
