package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyChicaBlockDisplayItem;

public class ToyChicaBlockDisplayModel extends AnimatedGeoModel<ToyChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
